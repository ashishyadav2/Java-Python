import maths # maths is file created my me maths.py can be imported as module
#to call function inside a module
#syntax module_name.function_name

#renaming a module
print(maths.maxx(5,669))
print(maths.minn(5,-54))
lstt = [5,9,5,6,5,-6]
print(maths.summ(lstt))

#to use variable from a module
a = maths.person["drinks"]
print(a)

import maths as m
print(m.maxx(5,98))

#using dir() function , it gives all functions inside the module
print(dir(maths))

#using import from module if you want to import specific part of the module
from maths import person,maxx
print(maxx(92,45)) #if you are importing only part of the module no need to use module_name functions can be used directly