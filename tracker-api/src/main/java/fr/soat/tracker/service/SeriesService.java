package fr.soat.tracker.service;

import fr.soat.tracker.model.Series;
import fr.soat.tracker.repo.SeriesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriesService {

    private SeriesRepository seriesRepository;

    public SeriesService(SeriesRepository repository) {
        this.seriesRepository = repository;
    }

    public List<Series> findAll() {
        return seriesRepository.findAll();
    }
}
