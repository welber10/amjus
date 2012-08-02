/**
 * 
 */
package br.com.w11.amjus.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author welber
 *
 */
@MappedSuperclass
public abstract class Pessoa {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	@Size(min = 5, max = 50)
	private String nome;

	@Size(max = 20)
	private String apelido;

	@Column(unique = true)
	@Size(max = 11)
	private String cpf;
	
	@Size(max = 20)
	private String rg;

	@Temporal(TemporalType.DATE)
	private Date nascimento;

	@Enumerated
	private TipoSexo sexo;

	@Size(max = 120)
	private String endereco;

	@Size(max = 50)
	private String bairro;

	@Size(max = 50)
	private String complemento;

	@Size(max = 50)
	private String cidade;

	@Size(max = 2)
	private String uf;

	@Size(max = 50)
	private String pais;

	@Size(max = 50)
	private String pontoReferencia;

	@Size(max = 9)
	private String cep;

	@Size(max = 4)
	private String ddd;

	@Size(max = 10)
	private String telefone;

	@Size(max = 4)
	private String dddCelular;

	@Size(max = 10)
	private String celular;

	@Size(max = 4)
	private String dddTelefoneComercial;

	@Size(max = 10)
	private String telefoneComercial;

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

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public TipoSexo getSexo() {
		return sexo;
	}

	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getPontoReferencia() {
		return pontoReferencia;
	}

	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDddCelular() {
		return dddCelular;
	}

	public void setDddCelular(String dddCelular) {
		this.dddCelular = dddCelular;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDddTelefoneComercial() {
		return dddTelefoneComercial;
	}

	public void setDddTelefoneComercial(String dddTelefoneComercial) {
		this.dddTelefoneComercial = dddTelefoneComercial;
	}

	public String getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}

}
