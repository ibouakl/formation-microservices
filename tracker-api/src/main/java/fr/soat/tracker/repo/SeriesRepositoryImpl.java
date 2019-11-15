package fr.soat.tracker.repo;

import fr.soat.tracker.model.Episode;
import fr.soat.tracker.model.Season;
import fr.soat.tracker.model.Series;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class SeriesRepositoryImpl implements SeriesRepository {

    @Override
    public List<Series> findAll() {
        return buildSeries();
    }

    private List<Series> buildSeries() {
        List<Series> seriesList = new ArrayList<>();

        Episode episode = new Episode("1","episode1", 1);
        Season season = new Season("1", 1, "details1", Arrays.asList(episode));
        Series series1 = new Series("1", "Serie1", "details1", Arrays.asList(season));
        seriesList.add(series1);

        Episode episode2 = new Episode("2","episode2", 1);
        Season season2 = new Season("2", 2, "details2", Arrays.asList(episode2));
        Series series2 = new Series("2", "Serie2", "details2", Arrays.asList(season2));
        seriesList.add(series2);

        return seriesList;
    }
}
