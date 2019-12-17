package br.com.listadecompras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.listadecompras.model.Lista;
import br.com.listadecompras.repository.ListaRepository;


@Service
public class ListaService {

	@Autowired
	private ListaRepository listaRepo;


	public void salvar(Lista lista) {
		listaRepo.save(lista);
	}

	public List<Lista> listarTodos() {
		List<Lista> lista = listaRepo.findAll();
		return lista;
	}
}
