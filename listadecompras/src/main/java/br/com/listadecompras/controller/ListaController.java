package br.com.listadecompras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.listadecompras.model.Lista;
import br.com.listadecompras.service.ListaService;

@Controller
public class ListaController {
	
//	@Autowired
//	private AlunosRepository alunosRepo;

	//	@Autowired
	//	public AlunosController(AlunosRepository alunosRepo) {
	//		this.alunosRepo = alunosRepo;
	//	}

//	@Autowired
//	public void setAlunosRepo(AlunosRepository alunosRepo) {
//		this.alunosRepo = alunosRepo;
//	}
	
	@Autowired
	private ListaService listaService;

	@GetMapping("/lista")
	public ModelAndView listarAlunos() {
		//passe o nome da página ao construtor
		ModelAndView mv = new ModelAndView("lista_compras");
		// Busque a coleção com o service
		List<Lista> lista = listaService.listarTodos();
		//adicione a coleção ao objeto ModelAndView
		mv.addObject("lista", lista);
		mv.addObject(new Lista());
		//devolva o ModelAndView
		return mv;
	}

	@PostMapping
	public String salvar(Lista lista) {
		// salvar usando o service
		listaService.salvar(lista);
		return "redirect:/lista";
	}


}
