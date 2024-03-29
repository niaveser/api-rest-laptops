package com.example.springsesiones456.controller;

import com.example.springsesiones456.entities.Laptop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;

import java.util.Arrays;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LaptopControllerTest {
//    private TestRestTemplate testRestTemplate;
//
//    @Autowired
//    private RestTemplateBuilder restTemplateBuilder;
//
//    @LocalServerPort
//    private int port;
//
//    @BeforeEach
//    void setUp() {
//        restTemplateBuilder = restTemplateBuilder.rootUri("http://localhost:" + port);
//        testRestTemplate = new TestRestTemplate(restTemplateBuilder);
//    }
//
//    @Test
//    void findAll() {
//        ResponseEntity<Laptop[]> response =
//                testRestTemplate.getForEntity("/api/laptops", Laptop[].class);
//
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        assertEquals(200, response.getStatusCodeValue());
//
//        List<Laptop> laptops = Arrays.asList(response.getBody());
//        System.out.println(laptops.size());
//
//    }
//
//    @Test
//    void findOneById() {
//        ResponseEntity<Laptop> response =
//                testRestTemplate.getForEntity("/api/laptops/1", Laptop.class);
//
//        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
//
//
//    }
//
//    @Test
//    void create() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//
//        String json = """
//                {
//                    "modelo": "Yoga Slim 7 Pro Gen 6 Spring Test",
//                    "fabricante": "Lenovo",
//                    "price": 1299.65
//                }
//                """;
//        HttpEntity<String> request = new HttpEntity<>(json, headers);
//        ResponseEntity<Laptop> response = testRestTemplate.exchange("/api/laptops", HttpMethod.POST, request, Laptop.class);
//        Laptop result = response.getBody();
//
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        assertEquals(1L, result.getId());
//        assertEquals("Yoga Slim 7 Pro Gen 6 Spring Test", result.getModelo());
//
//    }
//
//    @Test
//    void update() {
//        //Comprueba que si no existe el portátil del id proporcionado devuelve NOT_FOUND
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//
//
//        String json = """
//                {
//                    "id": 3,
//                    "modelo": "Yoga Slim 7 Pro Gen 6 Spring Test",
//                    "fabricante": "Lenovo",
//                    "price": 1299.65
//                }
//                """;
//        HttpEntity<String> request = new HttpEntity<>(json, headers);
//        ResponseEntity<Laptop> response = testRestTemplate.exchange("/api/laptops/3", HttpMethod.PUT, request, Laptop.class);
//        Laptop result = response.getBody();
//        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
//
//    }
//
//    @Test
//    void delete() {
//
//        ResponseEntity<Void> response = testRestTemplate.exchange("/api/laptops/1", HttpMethod.DELETE, HttpEntity.EMPTY, Void.class);
//        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
//
//    }
//
//    @Test
//    void deleteAll() {
//
//        ResponseEntity<Void> response = testRestTemplate.exchange("/api/laptops", HttpMethod.DELETE, HttpEntity.EMPTY, Void.class);
//        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
//
//    }
}