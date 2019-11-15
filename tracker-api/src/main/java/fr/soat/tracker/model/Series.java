package fr.soat.tracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Series {

    private String id;

    private String title;

    private String details;

    private List<Season> seasonList;
}
