package com.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DoorStatus {
    private DoorStatusFrontRight doorstatusfrontright;
}
