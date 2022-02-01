package org.com.generation.lojaDeGames.repository;

import java.util.List;

import org.com.generation.lojaDeGames.model.categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<categoria, Long> {
	public List<categoria> findAllByDescricaoContainingIgnoreCase (String categoria);
	//busca  todos os atributos "nomes", tornando-os em letras minusculas
}
