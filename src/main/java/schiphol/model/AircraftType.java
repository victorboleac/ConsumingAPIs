package schiphol.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AircraftType(
        String iataMain,
        String iataSub
) {
}
