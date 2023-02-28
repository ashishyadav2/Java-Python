#built data structures
#list
#list are mutable data structures
new_list = [1,5,6,8,6]
lst = [] #empty list

listt = list([1,6,9,4])

#add value to list (append,extend,insert)
# add single element
new_list.append(35)
print(new_list)

#add multiple elements to a list
new_list.extend([9,15])
print(new_list)

new_list.extend(listt)
print(new_list)

#add element at a particular position
new_list.insert(2,69)
print(new_list)

#deletion
#pop, remove, del keyword
#pop(index)
new_list.pop(2)
print(new_list)

#remove(element)
new_list.remove(1) #rremoves first occerence of that element
print(new_list)

#del keyword list_name[index]
del new_list[6]
print(new_list)

for i in new_list[:2]: #from 0 to 1 slicing is used
    print(i,sep=" ",end=" ")

#sorting
#using sort sorted
new_list.sort()
print(new_list)

sorted(new_list)
print(new_list)
