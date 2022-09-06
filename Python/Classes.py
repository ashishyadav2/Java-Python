from msilib.schema import Class
from re import A

class Class1:
    def __init__(this,base,height,a,b):
        this.base = base
        this.height = height
        this.a = a
        this.b = b

    def calcAreaPerimeter(this):
        area = 0.5*this.base*this.height
        perimeter = this.base+this.a+this.b
        txtStr = "area is: {} and Perimeter is: {}"
        print(txtStr.format(area,perimeter))

obj1 = Class1(3,6,4,5)
obj1.calcAreaPerimeter()
del Class1 

