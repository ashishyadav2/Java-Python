import requests
from bs4 import BeautifulSoup
r = requests.get('https://news.google.com/topstories?hl=en-IN&gl=IN&ceid=IN:en')
soup = BeautifulSoup(r.content, 'html.parser')
content = soup.find_all('h3', class_ = 'ipQwMb ekueJc RD0gLb')
for cont in content:
    print(cont.text)
# r = requests.get('https://budgetbranders.com/blog/creative-indian-restaurant-names/')
# soup = BeautifulSoup(r.content, 'html.parser')
# s = soup.find('ol')
# content = s.find_all('span')
# str = "INSERT INTO EMPLOYEE VALUES('{}','B','smith',123456789,to_date('1965-01-09','yyyy-mm-dd'),'731 Fondren Houston,TX','M',30000,333445555,5);"
# for cont in content:
#     print(str.format(cont.text))

