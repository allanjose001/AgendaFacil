package com.api.agendafacil.models;

/*classe modelo para o banco de dados
 *é ela que define o formato do banco de dados
 *com ela é possivel adicionar ou remover colunas de informações a
 *serem escritas no banco de dados
*/

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "TB_UBS")
@Table(name = "TB_AGENDA_FACIL")

public class AgendaFacilModelo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	@Column(nullable = false, length = 200)
	private String imagemUBS;
	@Column(nullable = false, length = 200)
	private String nomeUBS;
	@Column(nullable = false, length = 200)
	private String bairro;
	@Column(nullable = false, length = 200)
	private String rua;
	@Column(nullable = false)
	private LocalDateTime registrationDate;
	@Column(nullable = false, length = 130)
	private String nomeResponsavel;
	
	//getters e setters
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getImagemUBS() {
		return imagemUBS;
	}
	public void setImagemUBS(String imagemUBS) {
		this.imagemUBS = imagemUBS;
	}
	public String getNomeUBS() {
		return nomeUBS;
	}
	public void setNomeUBS(String nomeUBS) {
		this.nomeUBS = nomeUBS;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}
	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
