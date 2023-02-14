package com.example.registry.controller;

import com.example.registry.model.VehicleServiceObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registry")
@Slf4j
public class RegistryController {
    @GetMapping(path = "/{vin}")
    public VehicleServiceObject get(@PathVariable(name = "vin") String vin){
        VehicleServiceObject v = new VehicleServiceObject();
        v.setVin(vin);
        v.setModel("Ford");
        v.setType("SUV");
        v.setYear(2019);
        log.info("Returning vehicle with vin: {}", v);
        return v;
    }
}
