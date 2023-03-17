package com.example.consumingrest;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NBAService {

    RestTemplateBuilder builder = new RestTemplateBuilder();
    RestTemplate restTemplate = builder.defaultHeader("X-RapidAPI-Key","c81ef55ee3msh7dd139f3c54098ep14617ejsn7691edb443eb").build();

    public ChuckQuote.Dada getChuckQuote(){

        ChuckQuote.Dada quote = restTemplate.getForObject("https://free-nba.p.rapidapi.com/players", ChuckQuote.Dada.class);
        return quote;
    }
}