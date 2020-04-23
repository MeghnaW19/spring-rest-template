package com.stackroute.commander.test.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.commander.test.domain.CovidStat;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;
import static org.junit.jupiter.api.Assertions.*;

//@ExtendWith(MockitoExtension.class)
///**
// * With the @SpringBootTest annotation, Spring Boot provides a convenient way to start up an application context to be used in a test
// */
@SpringBootTest
class CovidStatServiceImplTest {

    @Test
    void givenCorrectUrlShouldCheckForPositiveResponse() throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        String baseUrl = "http://localhost:8088/api/v1/covidstat";
        CovidStat result = restTemplate.getForObject(baseUrl, CovidStat.class);
        /*
                Verify request succeed
        */
        System.out.println(result);

    }


}
