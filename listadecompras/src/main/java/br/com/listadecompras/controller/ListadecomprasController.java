package br.com.listadecompras.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ListadecomprasController {
	
		@GetMapping ("/lista")
		public String lista() {
			return "lista_de_compras";
		}
		
	


}
