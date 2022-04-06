package br.com.etechoracio.pw3detran.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table
@Getter 
@Setter
public class Pessoa {
	@Column (name = "IdPessoa")
	@Id
	int id;
	@Column (name = "nome")
	String nome;
	@Column(name = "endereço")
	String endereco;
	
}
