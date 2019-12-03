package com.ingenico.tem.microservices.userapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class User {
    private String firstName;
    private String lastName;

    private List<Series> series;
}
