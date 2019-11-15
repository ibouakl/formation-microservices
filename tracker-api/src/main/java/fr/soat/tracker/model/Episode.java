package fr.soat.tracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Episode {

    private String id;

    private String title;

    private int number;
}
