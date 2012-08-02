/**
 * 
 */
package br.com.w11.amjus.data;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.com.w11.amjus.model.Encontro;
import br.com.w11.amjus.model.Member;

/**
 * @author root
 *
 */
@RequestScoped
public class EncontroLista {

	@Inject
	private EntityManager em;
	
	private List<Encontro> list;

	@Produces
	@Named
	public List<Encontro> getEncontros() {
		return list;
	}
	
	public void onMemberListChanged(
			@Observes(notifyObserver = Reception.IF_EXISTS) final Encontro encontro) {
		retrieveAllEncontrosOrderedByName();
	}

	@PostConstruct
	public void retrieveAllEncontrosOrderedByName() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Encontro> criteria = cb.createQuery(Encontro.class);
		Root<Encontro> encontro = criteria.from(Encontro.class);
		// Swap criteria statements if you would like to try out type-safe
		// criteria queries, a new
		// feature in JPA 2.0
		// criteria.select(member).orderBy(cb.asc(member.get(Member_.name)));
		criteria.select(encontro).orderBy(cb.asc(encontro.get("nome")));
		list = em.createQuery(criteria).getResultList();
	}
	
}
