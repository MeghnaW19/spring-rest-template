package com.stackroute.commander.test.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.commander.test.domain.CovidStat;
import com.stackroute.commander.test.service.CovidStatService;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;

import java.net.URISyntaxException;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class CovidStatControllerTest {

    private MockMvc mockMvc;
    @Mock
    CovidStatService covidStatService;
    @InjectMocks
    private CovidStatController covidStatController;

    private CovidStat covidStat;

    private MockRestServiceServer mockServer;

    @Autowired
    RestTemplate restTemplate = new RestTemplate();



    /**
     * Run this before each test case
     */
    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(covidStatController).build();

        mockServer = MockRestServiceServer.createServer(restTemplate);

    }

    /**
     * Run this after each test case
     */
    @AfterEach
    void tearDown() {
        covidStat = null;
    }

    /**
     * Test annotation tells JUnit that the public void method to which it is attached can be run as a test case
     */
    @Test
    void givenGetMappingUrlShouldReturnTheResult() throws Exception {
        when(covidStatService.getCovidStat()).thenReturn(covidStat);
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/covidstat")
                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(covidStat)))
                .andDo(MockMvcResultHandlers.print());

        verify(covidStatService).getCovidStat();
        verify(covidStatService, times(1)).getCovidStat();
    }

    @Test
    void givenCorrectUrlShouldCheckForPositiveResponse()  {
       

       final String baseUrl = "http://localhost:8080/api/v1/covidstat";
       ResponseEntity<String> result = restTemplate.getForEntity(baseUrl, String.class);
       /*
               Verify request succeed
       */
       Assert.assertEquals(200, result.getStatusCodeValue());
       Assert.assertEquals(true, result.getBody().contains("employeeList"));


//        mockServer.expect(requestTo("http://google.com"))
//                .andExpect(method(HttpMethod.GET))
//                .andRespond(withSuccess("resultSuccess", MediaType.TEXT_PLAIN));
//
//        String result = simpleRestService.getMessage();
//
//        mockServer.verify();
//        assertThat(result, allOf(containsString("SUCCESS"),
//                containsString("resultSuccess")));
    }

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
