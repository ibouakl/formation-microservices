package fr.soat.tracker.controller;

import fr.soat.tracker.model.Series;
import fr.soat.tracker.service.SeriesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tracker-api/v1")
public class SeriesController {

    private SeriesService seriesService;

    public SeriesController(SeriesService seriesService) {
        this.seriesService = seriesService;
    }

    @GetMapping("/series")
    private List<Series> findALl() {
        return seriesService.findAll();
    }
}
