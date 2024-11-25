package schiphol.DAO;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.reactive.function.client.WebClient;
import schiphol.model.Results;

public class FlightDAO {
    private static final String URL = "https://api.schiphol.nl/public-flights/";

    public static Results requestData(String params, String appId, String apiKey) throws JsonProcessingException {
        WebClient webClient = WebClient.builder().baseUrl(URL).build();
        String responseBody;
        ObjectMapper mapper = new ObjectMapper();
        Results object;
        responseBody = webClient // Reassign the result to a String
                .get()
                .uri(params)
                .header("Accept", "application/json")
                .header("app_id", appId)
                .header("app_key", apiKey)
                .header("ResourceVersion", "v4")
                .retrieve()
                .bodyToMono(String.class) // Bind the returned JSON body to a String
                .block();
        object = mapper.readValue(responseBody, Results.class);
        return object;
    }

    }



