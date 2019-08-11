# REST API concepts
## Web Services
- Web Services are different pieces of code deployed on different machines and they call methods of each other over the network.
### Web Service Types
There are two kinds of Web Services: SOAP and REST.
#### REST Web Services
- REST Web Services gives its response data returned in XML/JSON formats and has specific URLs for different operations.
### Web Services Characteristics
- Web Services exchange of data happens over the web using **HTTP exchange**. So the client sends an HTTP request and the server returns back an HTTP response.
- **The protocol** is the message format for message exchange between the client and the server in a Web Service communication environment.
- **Service definition** or service documentation. It's common to have REST Web Services with little to no documentation, so the best REST Web Services doesn't need any documentation.
- REST actually stands for REpresentational State Transfer.
- REST is an architecture style, so REST is a set of guidelines used to guide you in your application architecture.
- We can have kinds of REST Web Services: Not fully RESTful and Completely RESTful.
## REST and HTTP
- Resource based URIs
- HTTP Methods
- HTTP Status codes
- Message headers
### HTTP Methods
- GET, POST, PUT, DELETE
### HTTP Status codes
- 200 - Success
- 500 - Server error
- 404 - Not found
## Resource URIs
- Resource relations
- Designing RESTFUL URIs
## Two types of resource URIs
- Instance resource URIs
- Collection resource URIs 
## HTTP Methods 
- post -> create
- delete -> delete 
- put -> update
- get -> select
## Method idempotence 
### Idempotent
- Safely repeatable
- GET, PUT, DELETE
### Nonidempotent
- Cannot be repeated safely
- POST
## Responses
### Resource Representations
- XML
- JSON
### Status Codes
- 1XX Informational
- 2XX Success
- 3XX Redirection
  - 302 Found
  - 304 Not Modified
  - 307 Temporary 
- 4XX Client Error
  - 400 Bad Request
  - 401 Unauthorized
  - 403 Forbidden
  - 404 Not Found 
  - 415 Unsupported Media Type 
- 5XX Serve Error 
  - 500 Internal Server Error 
## HATEOAS
- Hypermedia
- As
- The
- Engine
- Of
- Application
- State
## The Richardson Maturity Model 
- Is this API fully RESTful?
- Leonard Richardson
- Level 3 
  - HATEOAS
  - Responses have links that the clients can use 
- Level 2 
  - HTTP Methods 
  - Uses the right HTTP methods, status codes 
- Level 1 
  - Individual URIs for each resource 
- Level 0 
  - Swamp of XML 
# [Next](https://www.youtube.com/watch?v=BuYivu9ZjDw&list=PLqq-6Pq4lTTZh5U8RbdXq0WaYvZBz2rbn&index=10)