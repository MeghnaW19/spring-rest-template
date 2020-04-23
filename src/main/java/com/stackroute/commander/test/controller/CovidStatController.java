package com.stackroute.commander.test.controller;

import com.stackroute.commander.test.domain.CovidStat;
import com.stackroute.commander.test.service.CovidStatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/")
public class CovidStatController {

    private static final Logger logger = LoggerFactory.getLogger(CovidStatController.class);
    private CovidStatService covidStatService;

    @Autowired
    public CovidStatController(CovidStatService covidStatService) {
        this.covidStatService = covidStatService;
    }

    /*
        To retrieve the external api data
    */
    @GetMapping("covidstat")
    public ResponseEntity<CovidStat> getCovidStat() {
        logger.info(".... Fetching the Covid Stat");
        ResponseEntity responseEntity;
        CovidStat retrievedCovidStat = covidStatService.getCovidStat();
        responseEntity = new ResponseEntity<CovidStat>(retrievedCovidStat, HttpStatus.OK);
        return responseEntity;


    }

}