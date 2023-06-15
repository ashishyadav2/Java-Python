import streamlit as st
import pickle as pkl
import numpy as np
import locale
import math
import time

model = pkl.load(open('house_model.pkl', 'rb'))
df = pkl.load(open('dataframe.pkl', 'rb'))
st.title("House Price Predictor")

location = st.selectbox("Location", sorted(df['Location'].unique()))
area = st.number_input("Area", step=100)
bedroom = st.number_input("Bedroom", step=1)
locale.setlocale(locale.LC_ALL, 'en_IN')

if st.button("Predict Price"):
    with st.spinner('Calculating'):
        time.sleep(5)
    var = None
    query = np.array([[area, location, bedroom]])
    prediction = math.floor(np.exp(model.predict(query)[0]))
    lower_bound = prediction - ((prediction*15)/100)
    upper_bound = prediction + ((prediction*15)/100)
    f1 = locale.currency(lower_bound, grouping=True)
    f2 = locale.currency(upper_bound, grouping=True)
    avg = locale.currency(prediction, grouping=True)
    st.markdown(f"Average: {str(avg)}")    
    st.header(f1+" - "+f2)
