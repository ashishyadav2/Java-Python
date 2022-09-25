# class Class1:
#     def __init__(this,base,height,a,b):
#         this.base = base
#         this.height = height
#         this.a = a
#         this.b = b

#     def calcAreaPerimeter(this):
#         area = 0.5*this.base*this.height
#         perimeter = this.base+this.a+this.b
#         txtStr = "area is: {} and Perimeter is: {}"
#         print(txtStr.format(area,perimeter))

# obj1 = Class1(3,6,4,5)
# obj1.calcAreaPerimeter()
# del Class1 


#inheritance
class Person:
    def __init__(self,fname,lname):
        self.fname = fname
        self.lname = lname

    def print_name(self):
        strr = "My name is {} {}"
        print(strr.format(self.fname,self.lname))

class Student(Person):
    def __init__(self,fname,lname,gradYear):
        super().__init__(fname,lname)
        self.gradYear = gradYear
    
    def welcome(self):
        strr = "My name is {} {} and grad year is {}"
        print(strr.format(self.fname,self.lname,self.gradYear))

obj4 = Student("Ashish","Yadav",2024)
obj4.welcome()
