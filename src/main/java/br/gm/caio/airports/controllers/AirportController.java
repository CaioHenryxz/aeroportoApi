/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gm.caio.airports.controllers;

import br.gm.caio.airports.entities.Airport;
import br.gm.caio.airports.service.AirportService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public List<Airport> findAll() {
        List<Airport> result = airportService.findAll();
        return result;
    }
    
    @GetMapping("/city/{cityName}")
public ResponseEntity<List<Airport>> findByCity(@PathVariable String cityName) {
    // Aqui você chama o service com o nome corrigido
    List<Airport> list = airportService.findByCity(cityName); 
    
    if (list.isEmpty()) {
        return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(list);
}
    
}
