# Getting started with the microservices

### A.1. Ensure recent Git is installed
``` bash
git version
```
> git version 2.15.1 (Apple Git-101)   

## B. Netflix eureka

### B.1. Add this dependency to the POM

``` bash
    <dependency>
        <groupId>org.springframework.cloud</groupId>
		<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
    </dependency>
```

### B.2. Enable Eureka Client 

Add the annotation @EnableEurekaClient to TrackerApiApplication