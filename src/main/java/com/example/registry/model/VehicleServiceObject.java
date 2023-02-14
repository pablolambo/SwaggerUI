package com.example.registry.model;

import lombok.Data;

@Data
public class VehicleServiceObject {
    private String model;
    private String vin;
    private Integer year;
    private String type;
}
