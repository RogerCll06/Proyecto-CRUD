package edu.pe.cibertec.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tbl_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codUsuario;
	@Column(name = "name_usua")
	private String nomUsuario;
	@Column(name = "surname_usua")
	private String apeUsuario;
	@Column(name = "email_usua")
	private String emailUsuario;

	public Usuario() {
		super();
	}

	public Usuario(int codUsuario, String nomUsuario, String apeUsuario, String emailUsuario) {
		super();
		this.codUsuario = codUsuario;
		this.nomUsuario = nomUsuario;
		this.apeUsuario = apeUsuario;
		this.emailUsuario = emailUsuario;
	}
	

	public Usuario(String nomUsuario, String apeUsuario, String emailUsuario) {
		super();
		this.nomUsuario = nomUsuario;
		this.apeUsuario = apeUsuario;
		this.emailUsuario = emailUsuario;
	}

	public int getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getNomUsuario() {
		return nomUsuario;
	}

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}

	public String getApeUsuario() {
		return apeUsuario;
	}

	public void setApeUsuario(String apeUsuario) {
		this.apeUsuario = apeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [codUsuario=" + codUsuario + ", nomUsuario=" + nomUsuario + ", apeUsuario=" + apeUsuario
				+ ", emailUsuario=" + emailUsuario + "]";
	}

}
