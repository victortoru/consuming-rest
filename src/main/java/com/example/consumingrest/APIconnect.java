package com.example.consumingrest;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class APIconnect {
    RestTemplateBuilder builder = new RestTemplateBuilder();
    RestTemplate restTemplate = builder.defaultHeader("X-RapidAPI-Key","c81ef55ee3msh7dd139f3c54098ep14617ejsn7691edb443eb").build();

    public APIconnect[] getAPIconnect(){
        APIconnect[] APIconnect = restTemplate.getForObject("https://rapidapi.com/vacationist/api/iata-and-icao-codes/", )
    }
}
