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
  - Resource locations
  - Addresses
- HTTP methods
  - GET 
  - POST 
  - PUT 
  - DELETE 
- HTTP status codes
  - 200 - Success
  - 500 - Server error
  - 404 - Not found 
- Message headers
  - Content types
    - text/xml
    - application/json
  - Content Negotiation
## Resource URIs
- Resource based URIs
- Every entity has an unique URI 
- Contains nouns, not verbs
- It contains plural nouns to get multiple resources or entities
- Doesn't not depends on frameworks
- Resource relations
- RESTful URIs are resource based 
## Two types of resource URIs
- Instance resource URIs
- Collection resource URIs 
- We can implement query parameters for pagination and filtering collection URIs
## HTTP Methods 
- With HTTP methods, the same URI can perform different operations 
- You make POST/DELETE/PUT/GET requests
- POST -> create
- DELETE -> delete 
- PUT -> update
- GET -> select
- HEAD 
- OPTIONS 
- On post request, the response will contain the entity ID
## Method idempotence 
- What is the difference between PUT and POST?
### Read only methods 
- GET 
### Write methods 
- POST, PUT, DELETE 
### Idempotent 
- Safely repeatable
- GET, PUT, DELETE
### Nonidempotent
- Cannot be repeated safely
- POST
## REST Response
- Headers
  - Message length
  - Date
  - Content Type 
- Message Body
### Resource Representations
- XML
- JSON
### Status Codes 
- 1XX Informational 
- 2XX Success 
  - 200 OK 
  - 201 Created 
  - 204 No Content 
- 3XX Redirection 
  - 302 Found 
  - 304 Not Modified 
  - 307 Temporary Redirect 
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
- HATEOAS is a way to provide links to resources in the responses so the client doesn't have to deal with the URL construction and the business flow
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
## Libraries
- JAX-RS
- Jersey *
  - (\*) Implements JAX-RS
- RESTEasy *
- Apache Livy
## JAX-RS REST demo made easy and fast!
- Create module
```
cd %WORKSPACE%
git clone https://github.com/ronald0009/demo200.git
cd demo200
```
- Packages
```
Module Group Id: com.rab.demo
Project Group Id: com.rab.demo.demo200
```
- ALT + SHIFT + N
- Maven Project
- Next
- Filter: jer...   (X)
- Add Archetype... (/)
  - Archetype Group Id: org.glassfish.jersey.archetypes
  - Archetype Artifact Id: jersey-quickstart-webapp
  - Archetype Version: 2.29
- OK
- Next
  - Group Id: com.rab.demo.demo200
  - Artifact Id: demo201
  - Version: 0.0.1-SNAPSHOT
  - Package: com.rab.demo.demo200
- Finish
- [My resource](http://localhost:8080/demo201/webapi/myresource)
## Creating a Resource 
- Create a new Java class 
- Add a method that returns the response
- Make sure your class is in the package configured in Jersey servlet's init-param
- Annotate class with @Path annotation 
- Annotate method with the right HTTP method annotation 
- Annotate method with the @Produces specifying response format 
- [Hello resource](http://localhost:8080/demo202/webapi/helloresource)
## Returning XML Response
- Create the necessary model and service classes
- Ensure the model class has a no-argument constructor
- Call the service from MessageResource and return response
- Use the @Produces annotation with XML format
- Annotate model class with @XmlRootElement 
- [XML messages list](http://localhost:8080/demo203/webapi/messageresource)
## Installing a REST API client
- Install Postman
## Creating the service stub
- [XML messages list stub](http://localhost:8080/demo204/webapi/messageresource)
# [Next](https://www.youtube.com/watch?v=U4tOw0LxQW4&list=PLqq-6Pq4lTTZh5U8RbdXq0WaYvZBz2rbn&index=17)
## Accessing Path params
- [XML sample](http://localhost:8080/demo101/webapi/xmlmessage/1)
## Returning JSON Response
- [JSON sample](http://localhost:8080/demo102/webapi/jsonmessage)
## Implementing POST Method
- [POST sample](http://localhost:8080/demo102/webapi/jsonmessage)
## Implementing Update and Delete
- [PUT & DELETE samples](http://localhost:8080/demo102/webapi/jsonmessage/1)
## Simplified
- [GET, POST, PUT & DELETE samples](http://localhost:8080/demo103/webapi/jsonmessage)
## Pagination and Filtering
- [URL for All](http://localhost:8080/demo104/webapi/jsonmessage)
- [URL for All with query](http://localhost:8080/demo104/webapi/jsonmessage?author=guesta)
## The Param Annotations
- Set header
```
Key: hParam
Value: testHValue
```
- Set cookie
```
Name: cParam
Value: testCParam
Path: /demo104/webapi/annotationservice
Domain name: localhost
```
- [URL of demo](http://localhost:8080/demo104/webapi/annotationservice/annotation;mParam=testMParam)
## Using Context and BeanParam annotations
- [Context demo](http://localhost:8080/demo104/webapi/annotationservice/context)
- [Bean filter demo](http://localhost:8080/demo105/webapi/jsonmessage?author=guesta)
## Implementing Subresources
```
/messages/{messageId}/comments/{commentId}
```
- [Get all comments](http://localhost:8080/demo105/webapi/jsonmessage/1/comment)
- [Get comment by ID](http://localhost:8080/demo105/webapi/jsonmessage/1/comment/2)
## Sending Status Codes and Location Headers
- [Create a message and get a status code](http://localhost:8080/demo106/webapi/jsonmessage)
## [Next 26](https://www.youtube.com/watch?v=HEabElNrfbo&list=PLqq-6Pq4lTTZh5U8RbdXq0WaYvZBz2rbn&index=26)
- 14:21
