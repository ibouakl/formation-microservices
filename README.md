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
        <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
    </dependency>
```

### B.2. Enable Eureka Server 

Add the annotation @EnableEurekaServer to Application.java

## C. Config server

### C.1. Add dependencies to the POM

``` bash
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-config-server</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
    </dependency>
```

### C.2. Enable Config Server 

Add the annotation @EnableConfigServer to TrackerConfigApplication

### C.3. Register to eureka

Add the annotation @EnableEurekaClient to TrackerConfigApplication.java

## D. Netflix zuul

### D.1. Add dependencies to the POM

``` bash
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-netflix-zuul</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-config</artifactId>
    </dependency>
```

### D.2. Enable Zuul 

Add the annotation @EnableZuulProxy to ApiGatewayApplication.java

### D.3. Register to eureka

Add the annotation @EnableEurekaClient to ApiGatewayApplication.java

### D.4. Configuration of routes
``` bash
zuul.routes.series.path= /tracker-api/v1/**
zuul.routes.series.serviceId= tracker-api
zuul.routes.series.stripPrefix= false
zuul.routes.series.sensitive-headers: Cookie,Set-Cookie,Authorization
```