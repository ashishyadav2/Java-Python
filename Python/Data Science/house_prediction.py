import streamlit as st
import pickle
import numpy as np
import locale

pkl_file = open("house_prediction.pkl","rb")
df = open("house_df.pkl","rb")
model = pickle.load(pkl_file)
df = pickle.load(df)

st.title("House Prediction Mumbai")
region = st.selectbox("Region",['West','East','Harbour','South','Other'])
area = st.number_input("Area",step=100, value=0)
bedroom = st.number_input("Bedroom",step=1, value=0)
bathroom = st.number_input("Bathroom",step=1, value=0)
# price_sqft = st.number_input("Price/Sq. Ft.",step=1000, value=0)

if st.button("Predict Price"):
    if region=="West":
        harbour = False
        other = False
        south = False
        west = True
    elif region=="South":
        harbour = False
        other = False
        south = True
        west = False
    elif region=="Harbour":
        harbour = True
        other = False
        south = False
        west = False
    elif region=="Other":
        harbour = False
        other = True
        south = False
        west = False
    else:
        harbour = False
        other = False
        south = False
        west = False
    # query = np.array([area,bedroom,bathroom,price_sqft,harbour,other,south,west])
    query = np.array([area,bedroom,bathroom,harbour,other,south,west])
    locale.setlocale(locale.LC_ALL, 'en_IN')
    formatted_price = locale.currency(round(model.predict([query])[0]), grouping=True)
    st.title(formatted_price)