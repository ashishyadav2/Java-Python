def maxx(num1,num2):
    if num1>num2:
        return num1
    return num2

def minn(num1,num2):
    if num1<num2:
        return num1
    return num2

def summ(iterable: list):
    res = 0
    for i in iterable:
        res += i
    return res

person = {
    "name": "John",
    "age":26,
    "country":"norway",
    "drinks": False,
    "cars" : ["honda","volvo"]
}
