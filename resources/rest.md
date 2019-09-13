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
## Accessing Path params
- [XML bean by ID](http://localhost:8080/demo205/webapi/messageresource/1)
## Returning JSON Response
- Add JSON maven dependency
```xml 
<dependency>
	<groupId>org.glassfish.jersey.media</groupId>
	<artifactId>jersey-media-moxy</artifactId>
</dependency>
```
- [JSON bean by ID](http://localhost:8080/demo206/webapi/messageresource/1)
## Implementing POST Method
- Clic on +
- Body/raw/JSON(application/json)
- Add JSON bean to request body
```
{
    "author": "Pierre",
    "created": "2019-09-01T12:18:32.015-05:00",
    "message": "Bonjour"
}
```
- [Add bean with POST request](http://localhost:8080/demo207/webapi/messageresource)
- [JSON beans with GET request](http://localhost:8080/demo207/webapi/messageresource)
## Implementing Update and Delete
1. Add JSON bean to request body
```
{
    "author": "Ronaldo",
    "created": "2019-09-01T12:18:32.015-05:00",
    "message": "Ola"
}
```
2. [Add bean with POST request](http://localhost:8080/demo208/webapi/messageresource)
3. [Get all messages with GET request](http://localhost:8080/demo208/webapi/messageresource)
4. Config PUT request 
- Clic on +
- Select PUT 
- Body/raw/JSON 
- Add JSON bean to request body 
```
{
    "id": 3,
    "author": "Ronaldo",
    "created": "2019-09-01T12:18:32.015-05:00",
    "message": "Orale"
}
```
4. [Update bean with PUT request](http://localhost:8080/demo208/webapi/messageresource/3)
5. [Get all messages with GET request](http://localhost:8080/demo208/webapi/messageresource)
6. Config DELETE request
- Clic on +
- Select DELETE 
7. [Delete bean with DELETE request](http://localhost:8080/demo208/webapi/messageresource/3)
8. [Get all messages with GET request](http://localhost:8080/demo208/webapi/messageresource)
## Simplified
- [Get all messages with GET request](http://localhost:8080/demo209/webapi/messageresource)
## Implementing another resource
1. [GET profiles](http://localhost:8080/demo210/webapi/profiles)
2. [GET profile by name](http://localhost:8080/demo210/webapi/profiles/pancho)
3. Config POST request 
4. Add JSON bean to request body 
```json
{
    "author": "Ronaldo",
    "created": "2019-09-01T17:59:08.234-05:00",
    "key": "ron",
    "message": "Ola"
}
```
5. [POST request](http://localhost:8080/demo210/webapi/profiles)
6. [GET all request](http://localhost:8080/demo210/webapi/profiles)
7. Config PUT request 
8. Add JSON bean to request body
```
{
    "author": "Ronaldo",
    "created": "2019-09-01T17:59:08.234-05:00",
    "id": 3,
    "key": "ron",
    "message": "Orale"
}
```
9. [PUT request](http://localhost:8080/demo210/webapi/profiles/3)
10. [GET all request](http://localhost:8080/demo210/webapi/profiles)
## Pagination and Filtering
- [GET messages](http://localhost:8080/demo211/webapi/messages)
- [GET messages 4 year](http://localhost:8080/demo211/webapi/messages?year=2019)
- [GET messages paginated](http://localhost:8080/demo211/webapi/messages?start=1&size=2)
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
Path: /demo211/webapi/inject
Domain name: localhost
```
- [Injected annotated GET request](http://localhost:8080/demo211/webapi/inject/annotation;mParam=testMParam)
## Using Context and BeanParam annotations
- [Context demo](http://localhost:8080/demo211/webapi/inject/context)
- [Bean filter demo](http://localhost:8080/demo212/webapi/messages?start=1&size=2)
## Implementing Subresources
```
/messages/{messageId}/comments/{commentId}
```
- @Path annotation at class level is optional for sub-resources!
- [Bean filter test](http://localhost:8080/demo213/webapi/messages?start=1&size=2)
- Add comment to POST request
```
{
    "message": "Good example!",
    "author": "Yol"
}
```
- [Add comment POST url](http://localhost:8080/demo213/webapi/messages/1/comments?messageId=1)
- [Get comments from message number 1](http://localhost:8080/demo213/webapi/messages/1/comments)
## Sending Status Codes and Location Headers
- [Create a message and get a status code](http://localhost:8080/demo106/webapi/jsonmessage)
- Add JSON bean to request body
```
{
    "author": "Pierre",
    "created": "2019-09-01T12:18:32.015-05:00",
    "message": "Bonjour"
}
```
- [Add bean with POST request](http://localhost:8080/demo214/webapi/messages)
- See headers content
```
Location: http://localhost:8080/demo214/webapi/messages/5
```
- [JSON beans with GET request](http://localhost:8080/demo214/webapi/messages?start=3&size=2)
## Handling Exceptions
- [GET HTTP 500 status code with custom message](http://localhost:8080/demo215/webapi/messages/6)
- Create ErrorMessage class and annotate it with XmlRootElement annotation because we need this class can be converted to JSON
- We will create the class for custom exception mapping and annotate this with the Provider annotation, so JAX-RS can scan all classes annotated like this 
- [GET HTTP 404 managed with our app server](http://localhost:8080/demo215/webapi/messages/6)
- [GET HTTP 404 status thanks to our exception mapper](http://localhost:8080/demo216/webapi/messages/6)
- [GET HTTP 500 status thanks to our generic exception mapper](http://localhost:8080/demo216/webapi/msg)
## Using WebApplicationException
- Remove Provider annotation from generic exception mapper 
- [GET 404 status](http://localhost:8080/demo217/webapi/messages/200/comments/100)
- [GET custom message](http://localhost:8080/demo217/webapi/messages/2/comments/100)
- [GET 404 status from not found exception handler](http://localhost:8080/demo218/webapi/messages/200/comments/100)
# [Next](https://www.youtube.com/watch?v=Mp6LpIg7h84&list=PLqq-6Pq4lTTZh5U8RbdXq0WaYvZBz2rbn&index=29)
