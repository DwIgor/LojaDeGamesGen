package org.com.generation.lojaDeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // informa que é uma tabela 
@Table(name = "produto") // nomeia a tabela
public class produto {

@Id // informa que o atributo "id" é uma chave primária
@GeneratedValue(strategy = GenerationType.IDENTITY) //auto incrementa a chave estrangeira
private long id;

@NotBlank// o campo não aceita somente espaços
@Size(min = 5, max = 1000, message = "Deve conter no minimo 5 e no maximo 1000 caracteres")
private String nome;

@NotNull
@Size(min = 5, max = 1000, message = "Deve conter no minimo 5 e no maximo 1000 caracteres")
private double valor;

@ManyToOne
@JsonIgnoreProperties("produto")
private categoria categoria;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public double getValor() {
	return valor;
}

public void setValor(double valor) {
	this.valor = valor;
}


}
