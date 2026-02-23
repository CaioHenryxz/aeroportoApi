/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.gm.caio.airports.repositories;

import br.gm.caio.airports.entities.Airport;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author digma
 */
public interface AirportRepository extends JpaRepository<Airport, Long> {
    
    // Este método buscará pela coluna 'city' ignorando maiúsculas/minúsculas
    List<Airport> findByCityIgnoreCase(String city);
}