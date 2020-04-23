//package com.stackroute.commander.test.service;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.stackroute.commander.test.domain.CovidStat;
//import org.junit.Before;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.client.ExpectedCount;
//import org.springframework.test.web.client.MockRestServiceServer;
//import org.springframework.web.client.RestTemplate;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@ExtendWith(MockitoExtension.class)
///**
// * With the @SpringBootTest annotation, Spring Boot provides a convenient way to start up an application context to be used in a test
// */
//@SpringBootTest
//class CovidStatServiceImplTest {
//
//    @Mock
//    private RestTemplate restTemplate;
//
//    @InjectMocks
//    private CovidStatService covidStatService = new CovidStatServiceImpl();
//
//    private MockRestServiceServer mockServer;
//    private ObjectMapper mapper = new ObjectMapper();
//
//    @Before
//    public void init() {
//        mockServer = MockRestServiceServer.createServer(restTemplate);
//    }
//
//    @Test
//    public void givenMockingIsDoneByMockRestServiceServer_whenGetIsCalled_thenReturnsMockedObject()() {
//        CovidStat emp = new CovidStat();
//        mockServer.expect(ExpectedCount.once(),
//                requestTo(new URI("http://localhost:8088/covidstat")))
//                .andExpect(method(HttpMethod.GET))
//                .andRespond(withStatus(HttpStatus.OK)
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .body(mapper.writeValueAsString(emp))
//                );
//
//        Employee employee = empService.getEmployee(id);
//        mockServer.verify();
//        Assert.assertEquals(emp, employee);
//    }
//}