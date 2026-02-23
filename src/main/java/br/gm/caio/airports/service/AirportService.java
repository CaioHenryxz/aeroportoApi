/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gm.caio.airports.service;

import br.gm.caio.airports.DTO.AirportMinDTO;
import br.gm.caio.airports.entities.Airport;
import br.gm.caio.airports.repositories.AirportRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author digma
 */
@Service
public class AirportService {
    
    @Autowired
    private AirportRepository airportRepository;
    
    public List<Airport> findAll() {
        return airportRepository.findAll();
    }
    
    // Corrigido de findByCty para findByCity
    public List<Airport> findByCity(String city) {
        return airportRepository.findByCityIgnoreCase(city);
    }
    
    public List<AirportMinDTO> findByCountry(String country) {
        List<Airport> resultAirport = airportRepository.findByCountryIgnoreCase(country);
        
        List<AirportMinDTO> resultDTO = resultAirport.stream().map(x -> new AirportMinDTO(x)).toList();
        return resultDTO;
    }
    
    public Airport findByIataCode(String iataCode){
        Airport result = airportRepository.findByIataCode(iataCode);
        return result;
    }
}
