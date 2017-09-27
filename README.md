1. docker run -d -p 27000:27017 --name mongo mongo

2. docker build -t driftavbrott-rest:latest .

3. docker run -p 8080:8080 --name driftavbrott-rest --link=mongo  driftavbrott-rest
