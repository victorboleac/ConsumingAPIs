package org.northcoders.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Results(String status, int code, String locale, String seed, int total, List<Book> data) {
}
