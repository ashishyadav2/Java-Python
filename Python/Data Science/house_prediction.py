import streamlit as st
import pickle as pkl
import numpy as np
import locale

model = pkl.load(open('house_model.pkl', 'rb'))
df = pkl.load(open('dataframe.pkl', 'rb'))
st.title("House Price Predictor")

location = st.selectbox("Location", sorted(df['Location'].unique()))
area = st.number_input("Area", step=100)
bedroom = st.number_input("Bedroom", step=1)
locale.setlocale(locale.LC_ALL, 'en_IN')

if st.button("Predict Price"):
    query = np.array([[area, location, bedroom]])
    prediction = np.exp(model.predict(query)[0])
    formatted_price = locale.currency(prediction, grouping=True)
    st.title(formatted_price)
