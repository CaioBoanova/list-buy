package br.com.listadecompras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.listadecompras.model.Lista;



public interface ListaRepository extends JpaRepository<Lista, Long> {
	
	


}
