/**
 * 
 */
package br.com.w11.amjus.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author welber
 *
 */
@Entity
//@Embeddable
public class Participante extends Pessoa {
	
	@Size(max = 50)
    private String profissao;

    @Size(max = 50)
    private String religiao;

    @Size(max = 50)
    private String igreja;

    @NotNull
    private Boolean alergia;

    @Size(max = 50)
    private String descricaoAlergia;

    @NotNull
    private Boolean medicacao;

    @NotNull
    private Boolean vegetariano;

    @Size(max = 50)
    private String descricaoMedicacao;

    @NotNull
    @Size(min = 5, max = 50)
    private String pai;

    @NotNull
    @Size(min = 5, max = 50)
    private String mae;

    @Size(max = 120)
    private String enderecoPais;

    @Size(max = 50)
    private String bairroPais;

    @Size(max = 9)
    private String cepPais;

    @Size(max = 10)
    private String telefonePais;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Referencia> referencias = new HashSet<Referencia>();

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getReligiao() {
		return religiao;
	}

	public void setReligiao(String religiao) {
		this.religiao = religiao;
	}

	public String getIgreja() {
		return igreja;
	}

	public void setIgreja(String igreja) {
		this.igreja = igreja;
	}

	public Boolean getAlergia() {
		return alergia;
	}

	public void setAlergia(Boolean alergia) {
		this.alergia = alergia;
	}

	public String getDescricaoAlergia() {
		return descricaoAlergia;
	}

	public void setDescricaoAlergia(String descricaoAlergia) {
		this.descricaoAlergia = descricaoAlergia;
	}

	public Boolean getMedicacao() {
		return medicacao;
	}

	public void setMedicacao(Boolean medicacao) {
		this.medicacao = medicacao;
	}

	public Boolean getVegetariano() {
		return vegetariano;
	}

	public void setVegetariano(Boolean vegetariano) {
		this.vegetariano = vegetariano;
	}

	public String getDescricaoMedicacao() {
		return descricaoMedicacao;
	}

	public void setDescricaoMedicacao(String descricaoMedicacao) {
		this.descricaoMedicacao = descricaoMedicacao;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getEnderecoPais() {
		return enderecoPais;
	}

	public void setEnderecoPais(String enderecoPais) {
		this.enderecoPais = enderecoPais;
	}

	public String getBairroPais() {
		return bairroPais;
	}

	public void setBairroPais(String bairroPais) {
		this.bairroPais = bairroPais;
	}

	public String getCepPais() {
		return cepPais;
	}

	public void setCepPais(String cepPais) {
		this.cepPais = cepPais;
	}

	public String getTelefonePais() {
		return telefonePais;
	}

	public void setTelefonePais(String telefonePais) {
		this.telefonePais = telefonePais;
	}

	public Set<Referencia> getReferencias() {
		return referencias;
	}

	public void setReferencias(Set<Referencia> referencias) {
		this.referencias = referencias;
	}
    
}
