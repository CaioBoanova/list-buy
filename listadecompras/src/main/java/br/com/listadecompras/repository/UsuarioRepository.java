package br.com.listadecompras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.listadecompras.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Usuario findOneByLoginAndSenha(String login, String senha);

}
