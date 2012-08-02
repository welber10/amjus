package br.com.w11.amjus.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Encontro implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	@Size(max=70) @NotNull
	private String nome;
	
	@Column
	@Size(max=120) @NotNull
	private String local;
	
	@Column
	@Size(max=70) @NotNull
	private String igreja;
	
	@Column
	@Temporal(TemporalType.DATE) @NotNull
	private Date inicio;
	
	@Column
	@Temporal(TemporalType.DATE) @NotNull
	private Date fim;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getIgreja() {
		return igreja;
	}

	public void setIgreja(String igreja) {
		this.igreja = igreja;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}
	

}
