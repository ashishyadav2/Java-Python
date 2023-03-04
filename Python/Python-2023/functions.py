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