package org.northcoders.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Book(int id, String title, String author, String genre, String description, String isbn, String image, String published, String publisher) {
}
