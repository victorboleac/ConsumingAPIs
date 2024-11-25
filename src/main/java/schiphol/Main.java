package schiphol;

import com.fasterxml.jackson.core.JsonProcessingException;
import schiphol.DAO.FlightDAO;
import schiphol.model.Results;

public class Main {
    public static void main(String[] args) {
        String appId = "ddf6b34c";
        String params = "/flights";
        String apiKey = "92924cffcd42d6880eda20586f2c9092";

        try {
            Results testResults = FlightDAO.requestData(params, appId, apiKey);
            System.out.println(testResults);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
