package com.ingenico.tem.microservices.userapi.controller;

import com.ingenico.tem.microservices.userapi.client.SeriesClient;
import com.ingenico.tem.microservices.userapi.model.Series;
import com.ingenico.tem.microservices.userapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user-api/v1")
public class UserController {

    @Autowired
    private SeriesClient seriesClient;

    @GetMapping("/users")
    private List<User> findALl() {
        List<Series> someSeries = seriesClient.getSeries();
        User user1 = new User("Ali", "OMAR", someSeries);
        User user2 = new User("Yannick", "LECHEVIN", someSeries);
        return (Arrays.asList(user1, user2));

    }
}
