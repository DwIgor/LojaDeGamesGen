package org.com.generation.lojaDeGames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // informa que é uma tabela 
@Table(name = "categoria") // nomeia a tabela
public class categoria {
	
	
	@Id // informa que o atributo "id" é uma chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto incrementa a chave estrangeira
	 private long id;
	
	@NotBlank// o campo não aceita somente espaços
	@Size(max = 100, message = "Deve conter no maximo 100 caracteres")
	private String descricao;

	@NotBlank// o campo não aceita somente espaços
	@Size(max = 100, message = "Deve conter no maximo 100 caracteres")
	private String setor;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private  List<produto> produto;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	
	
}
