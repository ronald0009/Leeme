# JSPs and Servlets - Setting up
- Tomcat
- Eclipse
- Java EE / Servers / New Server / Set JDK and Tomcat's directory / Finish
- Select 'Use Tomcat installation (takes control of Tomcat installation)
# JSPs and Servlets - First Servlet Part 1
- Create Dynamic web project
- Config tomcat and check generate web.xml descriptor
# JSPs and Servlets - First Servlet Part 2
- Create annotated Servlet 
```java
package com.rab.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "annotationcfgservlet", urlPatterns = { "/annotationcfgservletpath" })
public class AnnotationCfgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
```
# JSPs and Servlets - Servlet XML Configuration
- Create xml configured Servlet
```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns="http://java.sun.com/xml/ns/javaee"
	xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
	id="WebApp_ID" version="3.0">
	<display-name>swp</display-name>
	<servlet>
		<servlet-name>xmlcfgservlet</servlet-name>
		<servlet-class>com.rab.servlet.XmlCfgServlet</servlet-class>
	</servlet>
	<servlet-mapping>
		<servlet-name>xmlcfgservlet</servlet-name>
		<url-pattern>/xmlcfgservletpath</url-pattern>
	</servlet-mapping>
	<welcome-file-list>
		<welcome-file>index.html</welcome-file>
	</welcome-file-list>
</web-app>
```
```java
package com.rab.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlCfgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
```
# JSPs and Servlets - The POST Method and Passing Parameters
- [Next](https://www.youtube.com/watch?v=MnUJl3NYRRc&list=PLE0F6C1917A427E96&index=6)
