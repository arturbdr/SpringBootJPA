package br.com.aprendendo.jpa.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.aprendendo.jpa.domain.Casa;

@Repository
public interface CasaRepository extends CrudRepository<Casa, Long>{

}
