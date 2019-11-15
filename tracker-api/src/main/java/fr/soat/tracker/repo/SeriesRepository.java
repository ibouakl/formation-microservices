package fr.soat.tracker.repo;

import fr.soat.tracker.model.Series;

import java.util.List;

public interface SeriesRepository {
    List<Series> findAll();
}
