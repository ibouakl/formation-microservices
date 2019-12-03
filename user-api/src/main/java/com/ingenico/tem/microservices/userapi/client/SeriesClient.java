package com.ingenico.tem.microservices.userapi.client;

import com.ingenico.tem.microservices.userapi.model.Series;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("tracker-api")
public interface SeriesClient {

    @RequestMapping(method = RequestMethod.GET, value = "tracker-api/v1/series")
    List<Series> getSeries();
}
