help(print) #prints the documentatiton of print
print("hello","world",sep="@",end="# ") #output seperated by @ and ends with #

#min
a = [5,9856,35,1]
print(min(a))
#max
print(max(a))
#sum
sum(a) #sum (iteratble,start=0)
sum(a,10) #sum of a + 10

#lambda function
#lamdda arguments: expression
b = lambda x: x*x
c = lambda x,y: x+y
print(b(5))
print(c(6,4))

def print_name(name):
    print("Hello {}".format(name))

print_name("Ashish")

def new_func(x):
    return (lambda y:x+y)
t = new_func(3) #lambda functiont is returned to t, x's value is given
print(t(6)) # y's value is given

#arbitrary Arguements, *args. multiple postional parameters. any valid python datatype can be passed
def function(*names):
    print(names)
lst = ["a",True,2,2.5]
sett = set({1,3,2})
dictt = {1:"hello",2:"world"}
tup = (1,2,3)
function(tup)

#keyword arguements, **args
def funct(**names):
    print(names["name"])
funct(title = "hellow",name="john")

#default parameter
def func(name="None"):#if no value is passed it will take default one
    print(name)
func("hello")
func()

#predefined python function data type, using type annotations
def fun(a:int,b:int) -> int: #it takes int values and return only int values
    return a+b

#another example
#by default python functions return None datatype means every function in pypthon have return statement
from typing import List
def fu(lst: List[int])-> List[int]: #it returns list of int values only
    return lst
lt = [5,6]
print(fu(lt))

