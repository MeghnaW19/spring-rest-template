package com.stackroute.commander.test.service;

import com.stackroute.commander.test.domain.CovidStat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CovidStatServiceImpl implements CovidStatService {

    public CovidStatServiceImpl() {
    }

    private String uri = "https://api.rootnet.in/covid19-in/stats/latest";

    /*
        RestTemplate
    */
    private RestTemplate restTemplate;

    @Autowired
    public CovidStatServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public CovidStat getCovidStat() {

        /*
            Send request with GET method
        */
        return restTemplate.getForObject(uri, CovidStat.class);
    }
}
