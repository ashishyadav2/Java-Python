import random
from matplotlib.pyplot import text
#single line comment
""" multi
line 
comment"""
from numpy import str_


print("hello world")

#variables
intr = 32
strg = "Ashish"
print(intr)
print(strg)

#type casting
intr_str = "32"
print(str(intr))
print(int(intr_str))
print(float(intr))

#get the var type
print(type(intr))

#Many Values to Multiple Variables
a,b,c = "mango","apple","banana"
print(a)
print(b)
print(c)

#Unpack a Collection
fruits = ["apple","mango","chery"]
x,y,z = fruits
print(x)
print(y)
print(z)

#Output Variables
print(x,y,z)
print(x + y + z)
int_num = 30
print(x,30)

#Global variables
str_temp = "world"
def myfunc():
    str_temp = "ashish"
    print("hello ",str_temp)

myfunc()

#global keyword
print("hello ",str_temp)
def myfunc2():
    global str_temp
    str_temp = "ashish"
    print("hello ",str_temp)

myfunc2()
print("hello ",str_temp)

"""
Text Type:	str
Numeric Types:	int, float, complex
Sequence Types:	list, tuple, range
Mapping Type:	dict
Set Types:	set, frozenset
Boolean Type:	bool
Binary Types:	bytes, bytearray, memoryview
None Type:	NoneType

x = "Hello World"	str	
x = 20	int	
x = 20.5	float	
x = 1j	complex	
x = ["apple", "banana", "cherry"]	list	
x = ("apple", "banana", "cherry")	tuple	
x = range(6)	range	
x = {"name" : "John", "age" : 36}	dict	
x = {"apple", "banana", "cherry"}	set	
x = frozenset({"apple", "banana", "cherry"})	frozenset	
x = True	bool	
x = b"Hello"	bytes	
x = bytearray(5)	bytearray	
x = memoryview(bytes(5))	memoryview	
x = None	NoneType

x = str("Hello World")	str	
x = int(20)	int	
x = float(20.5)	float	
x = complex(1j)	complex	
x = list(("apple", "banana", "cherry"))	list	
x = tuple(("apple", "banana", "cherry"))	tuple	
x = range(6)	range	
x = dict(name="John", age=36)	dict	
x = set(("apple", "banana", "cherry"))	set	
x = frozenset(("apple", "banana", "cherry"))	frozenset	
x = bool(5)	bool	
x = bytes(5)	bytes	
x = bytearray(5)	bytearray	
x = memoryview(bytes(5))	memoryview
"""
#Random Number
print(random.randrange(1,10))

#Multiline Strings
a = """hello world
hello world"""
print(a)

#strings are arrays
str_name = "ashish"
print(str_name[0])

#looping in arrays
for x in str_name:
    print(x)

#string len
print(len(str_name))

#Check String using in keyword
txt = "the best things in life are free"
print("free" in txt)

#checking with if statement
if "free" in txt:
    print("it is present")

#check if not
if "good" not in txt:
    print("it is not present")

#slicing
b = "hello world"    
print(b[2:]) #from index 2 till end
print(b[:3]) #from index 2 location till start
print(b[2:7]) #form index 2 to 6
print(b[:-1]) #from neg location to start

#lower and upper case strings
a = "hello WorLd"
print(a.upper())
print(a.lower())

#removing whitespace
print(a.strip())

#replace string
print(a.replace("h","j"))

#split string
print(a.split("|"))

#string format
age = 20
name = "ashish, age {}"
print(name.format(age))

#escape characters
#\'	Single Quote	
#\\	Backslash	
#\n	New Line	
#\r	Carriage Return	
#\t	Tab	
#\b	Backspace	
#\f	Form Feed	
#\ooo	Octal value	
#\xhh	Hex value

#collections in python
"""List is a collection which is ordered and changeable. Allows duplicate members.
Tuple is a collection which is ordered and unchangeable. Allows duplicate members.
Set is a collection which is unordered, unchangeable*, and unindexed. No duplicate members.
Dictionary is a collection which is ordered** and changeable. No duplicate members.
"""
# list methods
"""
append()	Adds an element at the end of the list
clear()	Removes all the elements from the list
copy()	Returns a copy of the list
count()	Returns the number of elements with the specified value
extend()	Add the elements of a list (or any iterable), to the end of the current list
index()	Returns the index of the first element with the specified value
insert()	Adds an element at the specified position
pop()	Removes the element at the specified position
remove()	Removes the item with the specified value
reverse()	Reverses the order of the list
sort()	Sorts the list"""

thislist = ["apple", "banana", "cherry", "orange", "kiwi", "mango"]
thislist[1:3] = ["blackcurrant", "watermelon"]
thislist.insert(0,"aam")
thislist.append("dragon fruit")
tropical = ["mango", "pineapple", "papaya"]
tupleList = ("book","pen")
thislist.extend(tropical)
thislist.extend(tupleList)
thislist.remove("mango")
thislist.pop(1)
thislist.pop()
#del thislist[0]
#thislist.clear()
#del thislist
print(thislist)

#list comprehension
fruits = ["apple", "banana", "cherry", "kiwi", "mango"]
newlist = []
for x in fruits:
    if "a" in x:
        newlist.append(x)

#newlist = [expression for item in iterable if condition == True]
newlist1 = [x for x in fruits if "a" in x]
print(newlist1)

# list sorting
newlist2 = [100,90,80,50]
newlist2.sort() #ascending sort
newlist2.sort(reverse = True)  #descending sort
print(newlist2)

# copying a list
newlist3 = ["mango","kiwi","apple"]
newlist4 = newlist3.copy()
newlist4 = list(newlist3)

#sets
"""
add()	Adds an element to the set
clear()	Removes all the elements from the set
copy()	Returns a copy of the set
difference()	Returns a set containing the difference between two or more sets
difference_update()	Removes the items in this set that are also included in another, specified set
discard()	Remove the specified item
intersection()	Returns a set, that is the intersection of two other sets
intersection_update()	Removes the items in this set that are not present in other, specified set(s)
isdisjoint()	Returns whether two sets have a intersection or not
issubset()	Returns whether another set contains this set or not
issuperset()	Returns whether this set contains another set or not
pop()	Removes an element from the set
remove()	Removes the specified element
symmetric_difference()	Returns a set with the symmetric differences of two sets
symmetric_difference_update()	inserts the symmetric differences from this set and another
union()	Return a set containing the union of sets
update()	Update the set with the union of this set and others """

# Dictionary
"""clear()	Removes all the elements from the dictionary
copy()	Returns a copy of the dictionary
fromkeys()	Returns a dictionary with the specified keys and value
get()	Returns the value of the specified key
items()	Returns a list containing a tuple for each key value pair
keys()	Returns a list containing the dictionary's keys
pop()	Removes the element with the specified key
popitem()	Removes the last inserted key-value pair
setdefault()	Returns the value of the specified key. If the key does not exist: insert the key, with the specified value
update()	Updates the dictionary with the specified key-value pairs
values()	Returns a list of all the values in the dictionary"""

