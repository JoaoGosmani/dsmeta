package br.com.joaogosmani.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
