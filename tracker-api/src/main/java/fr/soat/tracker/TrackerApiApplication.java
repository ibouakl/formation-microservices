package fr.soat.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TrackerApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrackerApiApplication.class, args);
    }

}
