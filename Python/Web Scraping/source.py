from unittest import result
import requests,json

url = "https://google-search55.p.rapidapi.com/search"
text = "google"
querystring = {"page":"1","q":"","safe":"false","language":"en","time":"default","as_sitesearch":"default"}
querystring['q'] = text

headers = {
	"X-RapidAPI-Key": "2d2dea647fmsh577c57bb54abd69p13249djsn06827c6f1fe8",
	"X-RapidAPI-Host": "google-search55.p.rapidapi.com"
}

response = requests.request("GET", url, headers=headers, params=querystring)
results = json.dumps(response.json(),indent = 4)
print(response.json()['top_stories'])