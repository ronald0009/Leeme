# Microservices
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
