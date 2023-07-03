import streamlit as st
import pickle as pkl
import numpy as np

model = pkl.load(open('diabetes.pkl','rb'))
st.title("Diabetes Classification")

# gender	age	hypertension	heart_disease	
# smoking_history	bmi	HbA1c_level	blood_glucose_level	
# diabetes
gender = st.selectbox("Gender",["Male","Female"])
age = st.number_input("Age",step=1)
hypertension = st.selectbox("Blood Pressure",["Yes","No"])
heart_disease = st.selectbox("Heart Disease",["Yes","No"])
is_smoker = st.selectbox("Smoker",['never', 'No Info', 'current', 'former', 'ever', 'not current'])
height = st.number_input("Height (ft.in)")
weight = st.number_input("Weight (kg)")
feet,inch = str(height).split(".")
height = ((int(feet)*12 + int(inch))*2.54)/100
bmi = round(weight/(height**2),2)
hba = st.number_input("HbA1c Level")
glucose = st.number_input("Glucose",step=10)
#pipe.predict([['Male',31,0,0,'never',23,6,120]])[0]
if st.button("Predict"):
    if hypertension=="Yes":
        hypertension=1
    else:
        hypertension = 0
    if heart_disease=="Yes":
        heart_disease=1
    else:
        heart_disease = 0
    query = np.array([[gender,age,hypertension,heart_disease,is_smoker,bmi,hba,glucose]])
    result = model.predict(query)[0]
    out = "NO"
    if result==1:
        out = "YES"
    st.header(out)
