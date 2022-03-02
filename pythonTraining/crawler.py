import urllib.request as req
import ssl
ssl._create_default_https_context= ssl._create_unverified_context
url="https://www.ptt.cc/bbs/movie/index.html"
request=req.Request(url, headers={
    "User-Agent":"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.128 Safari/537.36"
})
with req.urlopen(request) as response:
    data=response.read().decode("utf-8")
import bs4
root=bs4.BeautifulSoup(data,"html.parser")
titles=root.find_all("div",class_="title")
for title in titles:
    if title.a!= None:
        print(title.a.text)