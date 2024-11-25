package org.northcoders;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.northcoders.dao.FakeBooksDAO;
import org.northcoders.model.Results;
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