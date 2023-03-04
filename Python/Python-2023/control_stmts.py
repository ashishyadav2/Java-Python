#conditional statements
a = 2
b = 6
if (a>b):
    print("a>b")
elif(a==b):
    print("a==b")
else:
    print("a<b")

def isPrime(num):
    c = 2
    while c*c <= num:
        if num%c==0:
            return False
        c += 1
    return True

print(isPrime(13))

#ternary operator
c = 5
d = 7
print(d if c<d else c)

#for  in loop
lst = [2,6,8,6,9]
for i in lst:
    print(i,end=" ") #print elements after space by default is enter

#for loop using index
#len is used to get length of the list,tuple,sets and dictionary
for i in range(len(lst)):
    print(i)

string = "hello world"
#string{start_index:end_index} = [inclusive,exclusive)
for i in string[0:3]:
    print(i,end=" ")

#loop control statements
#break
for i in "Hello world!":
    if i == "r": #the loop will terminate is conditon is satisfied
        break
    print(i)

#continue
for i in "Hello world!":
    if i == "r": #when r is encountered it will skip it 
        continue
    print(i)
print("loop has ended")

#pass
for i in "Hello world!":
    if i == "r": #pass is null operataion means do nothing
        pass
    print(i)

#double loops
for i in range(10):
    for j in range(i):
        print(i, end=" ")
    print()

my_list = [1,2,3,4,5]
while my_list:
    print(my_list.pop(-1)) #pop -1 is used to get last element

#fibonacci series
#iterative
def fibo(num):
    a = 0
    b = 1
    i = 0
    while i<=num:
        print(a,end=" ")
        temp = b
        b = a+b
        a = temp
        i+=1

#recursion
def fib(num):
    if num<=1:
        return num
    return (fib(num-1)+fib(num-2))

print(fibo(10))
print(fib(10))