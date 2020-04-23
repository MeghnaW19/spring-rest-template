package com.stackroute.commander.test.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.commander.test.domain.CovidStat;
import com.stackroute.commander.test.service.CovidStatService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
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
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class CovidStatControllerTest {

    private MockMvc mockMvc;
    @Mock
    CovidStatService covidStatService;
    @InjectMocks
    private CovidStatController covidStatController;

    private CovidStat covidStat;
    
    /**
     * Run this before each test case
     */
    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(covidStatController).build();

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

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
