package fr.soat.tracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class Season {

    private String id;

    private int number;

    private String details;

    private List<Episode> episodeList;
}
