package com.PaolaCristine.prjImgs.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_cliente")
public class Cliente {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column (name = "ncliente")
	private String ncliente;

	@Column (name = "fone")
	private String fone;
	
	
	public Cliente() {

	}
	
	public Cliente(Long idcCliente, String ncliente, String fone) {
		this.idcCliente = idcCliente;
		this.ncliente = ncliente;
		this.fone = fone;
	}

	public Long getIdcCliente() {
		return idcCliente;
	}// fim do get

	public void setIdcCliente(Long idcCliente) {
		this.idcCliente = idcCliente;
	}// fim do set
	
	public String getNcliente() {
		return ncliente;
	}
	
	public void setNcliente(String ncliente) {
		this.ncliente = ncliente;
	}
	public String getFone() {
		return fone;
	}
	
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	
	
}
