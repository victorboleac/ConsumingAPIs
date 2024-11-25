package org.northcoders.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.northcoders.model.Results;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientException;

public class FakeBooksDAO {

    public static Results requestData(String params) throws JsonProcessingException {
        WebClient webClient = WebClient.builder().baseUrl("https://fakerapi.it/api/v1/").build();

        String responseBody;
        ObjectMapper mapper = new ObjectMapper();
        Results object;
        responseBody = webClient // Reassign the result to a String
                .get()
                .uri(params)
                .retrieve()
                .bodyToMono(String.class) // Bind the returned JSON body to a String
                .block();
        object = mapper.readValue(responseBody, Results.class);
        return object;
    }
}
