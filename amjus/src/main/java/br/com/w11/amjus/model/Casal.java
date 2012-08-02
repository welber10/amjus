/**
 * 
 */
package br.com.w11.amjus.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Past;

/**
 * @author welber
 *
 */
@Entity
public class Casal implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id 
    @GeneratedValue
    private String id;
	
	@Enumerated
    private TipoCor corPreferida;

    @ManyToOne
    private Referencia referencia;

    @Past
    @Temporal(TemporalType.DATE)
    private Date casamento;

    private String observacao;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Casal> padrinhos = new HashSet<Casal>();

    @OneToOne
    private Participante marido;

    @OneToOne
    private Participante esposa;

	public TipoCor getCorPreferida() {
		return corPreferida;
	}

	public void setCorPreferida(TipoCor corPreferida) {
		this.corPreferida = corPreferida;
	}

	public Referencia getReferencia() {
		return referencia;
	}

	public void setReferencia(Referencia referencia) {
		this.referencia = referencia;
	}

	public Date getCasamento() {
		return casamento;
	}

	public void setCasamento(Date casamento) {
		this.casamento = casamento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Set<Casal> getPadrinhos() {
		return padrinhos;
	}

	public void setPadrinhos(Set<Casal> padrinhos) {
		this.padrinhos = padrinhos;
	}

	public Participante getMarido() {
		return marido;
	}

	public void setMarido(Participante marido) {
		this.marido = marido;
	}

	public Participante getEsposa() {
		return esposa;
	}

	public void setEsposa(Participante esposa) {
		this.esposa = esposa;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Override
    public String toString() {
        return "Casal[ id=" + id + ", marido=" + this.getMarido().getNome() + ", esposa=" + this.getEsposa().getNome() + " ]";
    }

}
