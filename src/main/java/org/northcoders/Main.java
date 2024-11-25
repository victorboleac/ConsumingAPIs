package org.northcoders;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.northcoders.dao.FakeBooksDAO;
import org.northcoders.model.Results;
import org.springframework.web.reactive.function.client.WebClient;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Results testResults = FakeBooksDAO.requestData("books");
            System.out.println(testResults);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}