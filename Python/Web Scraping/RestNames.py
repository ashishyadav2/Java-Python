import requests,random
from bs4 import BeautifulSoup
r = requests.get('https://budgetbranders.com/blog/creative-indian-restaurant-names/')
soup = BeautifulSoup(r.content, 'html.parser')
s = soup.find('ol')
content = s.find_all('span')
str = "INSERT INTO RESTAURANT_DIM VALUES('{}','{}',{},'{}','{}');"
ids =0
for ids in range(0,9):
    ids += random.randint(0,9)
print(ids)
for cont in content:
    print(str.format(cont.text,cont.text,cont.text,cont.text,cont.text))
