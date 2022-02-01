package org.com.generation.lojaDeGames.repository;

import java.util.Optional;

import org.com.generation.lojaDeGames.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Optional<Usuario> findByUsuario(String usuario);
	

}
