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

## C. Config server

### C.1. Add this dependency to the POM

``` bash
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-config-server</artifactId>
    </dependency>
```

### C.2. Enable Config Server 

Add the annotation @EnableConfigServer to TrackerConfigApplication

### C.3. Register to eureka

Add the annotation @EnableEurekaClient to TrackerConfigApplication