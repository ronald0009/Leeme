# JSPs and Servlets - Setting up
- Tomcat
- Eclipse
- Java EE / Servers / New Server / Set JDK and Tomcat's directory / Finish
- Select 'Use Tomcat installation (takes control of Tomcat installation)
# JSPs and Servlets - First Servlet Part 1
- Create Dynamic web project
- Config tomcat and check generate web.xml descriptor
# JSPs and Servlets - First Servlet Part 2
- [Create annotated Servlet](https://github.com/ronald0009/demo3/tree/master/demo30)
- Open [localhost](http://localhost:8080/demo30/annotationcfgservletpath)
# JSPs and Servlets - Servlet XML Configuration
- [Create xml configured Servlet](https://github.com/ronald0009/demo3/tree/master/demo31)
- Open [localhost](http://localhost:8080/demo31/xmlcfgservletpath)
# JSPs and Servlets - Passing Parameters
- [Passing parameters from a Form to a Servlet](https://github.com/ronald0009/demo3/tree/master/demo32)
- Open [localhost](http://localhost:8080/demo32/)
# JSPs and Servlets - GET and POST
## GET
- Parameters in the URL
- Secure refresh
## POST
- No parameters in the URL
- Prevent refresh
# JSPs and Servlets - Request, Session and Context
- Tomcat creates and destroys Servlets
- Request and Response objects are created per access
- Servlet objects are not created per access. Every request have different Servlet threads, not instances
- [First session demo](https://github.com/ronald0009/demo3/tree/master/demo33)
- Open [localhost](http://localhost:8080/demo33/)
## Session object
- One per user/machine
- Objects available across requests
- Perfect for login sessions and shopping carts
## Context
- Across the entire application
- Shared across servlets and users
- Initialization code/Common bulletin board
- [Context demo](https://github.com/ronald0009/demo3/tree/master/demo34)
- Open [localhost](http://localhost:8080/demo34/)
## JSP Demo
- [JSP demo](https://github.com/ronald0009/demo3/tree/master/demo35)
- Open [localhost](http://localhost:8080/demo35/)
# JSP Directives
- [Directives demo](https://github.com/ronald0009/demo3/tree/master/demo36)
- Open [localhost](http://localhost:8080/demo36/)
## Scopes
- [localhost](http://localhost:8080/demo36/scopes.jsp?user=Test)
# Init value
- [Initial value demo](https://github.com/ronald0009/demo3/tree/master/demo37)
- Open [localhost](http://localhost:8080/demo37/)
# MVC Pattern
- Servlet is the controller
- Bean implements the business logic
- JSP renders the view
## Ingredients
- Controller
- Business Service
- Model
- View
- [MVC demo](https://github.com/ronald0009/demo3/tree/master/demo38)
- Open [localhost](http://localhost:8080/demo38/)
## Using RequestDispatcher in the MVC Application
- If you don't need to create a second request for the next jsp page in the flow of control, use Request Dispatcher.
- [Request Dispatcher demo](https://github.com/ronald0009/demo3/tree/master/demo39)
- Open [localhost](http://localhost:8080/demo39/)
## JSTL and the useBean tag
- [JSTL demo](https://github.com/ronald0009/demo3/tree/master/demo39)
- Open [localhost](http://localhost:8080/demo39/)
- Open [localhost default value](http://localhost:8080/demo39/success.jsp)
## Request Parameters with the setProperty tag
- [Set property demo](https://github.com/ronald0009/demo3/tree/master/demo390)
- Open [localhost](http://localhost:8080/demo390/)
