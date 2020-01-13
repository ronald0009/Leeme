# Microservices
## Concepts
- What Is a Microservices Architecture?
  - Small services in a computing architecture.
  - Microservices architectures are often referred to as a way to "break the monolith." Where break refers to the concept of breaking (or decomposing ) a single, large program into pieces.
  - So the microservices architecture is all about creating small programs (services) as a whole. The result still needs to behave like a single entity at times, while at other times it needs to have the properties of many smaller programs.
## Where to Use Microservices Architectures
- A large codebase. A small code base will probably derive less benefit from being split up into logical services.
- Enough developers to create teams devoted to individual services.
- An operational team can support the many services in the architecture.
- Well-defined underlying business processes.
## Monolithic architecture
### Disadvantages
- Deployment
- Scaling monolithic applications
- E-commerce application 
  - Deploy catalog functionality on a server
  - Deploy order processing to another server
  - User profile application to another one
  - View application on other one
  - This mini applications are what are called micro services
## Microservices architecture
### Advantages
- Deployment flexibility
- Technology flexibility
- Can be scaled separately
### Disadvantages
- Deployment / architecture complexity
- Service discovery
- Always use the right architecture for the problem
### Service discovery
- How does an application know how to call another application?
- Service discovery
- Client side service discovery
  - Eureka
- Server side service discovery
  - NGINX, AWS
## Step 1. Create the services 
```
URL: https://start.spring.io
Group: com.rab.demo.demo100
Artifact: movie-catalog-service
Java version: 11
Dependencies: Web
```
## [Next](https://www.youtube.com/watch?v=sd3BaQr2nxA&list=PLqq-6Pq4lTTZSKAFG6aCDVDP86Qx4lNas&index=7)
