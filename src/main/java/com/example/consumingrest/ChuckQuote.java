package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ChuckQuote(String first_name, String last_name, String position) {
@JsonIgnoreProperties(ignoreUnknown = true)
public record Dada(List<ChuckQuote> data){}
}