package schiphol.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;


@JsonIgnoreProperties(ignoreUnknown = true)
public record Flight(String flightName,
                     String id,
                     String scheduleDate,
                     int terminal,
                     String  actualLandingTime,
                     AircraftType aircraftType) {


}
/*
flightName
id
scheduledDate
terminal
actualLandingTime
aircraftType
 */