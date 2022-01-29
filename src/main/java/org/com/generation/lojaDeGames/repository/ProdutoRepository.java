package org.com.generation.lojaDeGames.repository;

import java.util.List;

import org.com.generation.lojaDeGames.model.produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<produto, Long>{
	
	public List<produto> findAllByNomeContainingIgnoreCase (String nome);
	//busca  todos os atributos "nomes", tornando-os em letras minusculas
}
