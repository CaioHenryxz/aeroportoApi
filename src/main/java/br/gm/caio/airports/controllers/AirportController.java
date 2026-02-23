/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gm.caio.airports.controllers;

import br.gm.caio.airports.entities.Airport;
import br.gm.caio.airports.service.AirportService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author digma
 */
@RestController
public class AirportController {
    
    @Autowired
    private AirportService airportService;
    
    @GetMapping("/airport")
    public List<Airport> findAll(){
        List<Airport> result = airportService.findAll();
        return result;
    }
    
}
