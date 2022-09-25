class Person:
    def __init__(self,fname,lname):
        self.fname = fname
        self.lname = lname

    def print_name(self):
        strr = "My name is {} {}"
        print(strr.format(self.fname,self.lname))

class Student(Person):
    def __init__(self,fname,lname,gradYear):
        super().__init__(self,fname,lname)
        self.gradYear = gradYear
    
    def welcome(self):
        strr = "My name is {} {} and grad year is {}"
        print(strr.format(self.fname,self.lname,self.gradYear))

obj4 = Student("Ashish","Yadav",2024)
obj4.welcome()