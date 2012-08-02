/**
 * 
 */
package br.com.w11.amjus.controller;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import br.com.w11.amjus.constant.AliasNavigationRule;
import br.com.w11.amjus.model.Casal;

/**
 * @author root
 *
 */
@Stateful
@Model
public class CasalCadastro {

	@Inject
	private Logger log;

	@Inject
	private EntityManager em;
	
	@Inject
	private Event<Casal> beanEventSrc;
	
	private Casal bean;
	
	@Produces
	@Named
	public Casal getCasal() {
		return bean;
	}
	
	public String insert() throws Exception {
		log.info("Cadastrando " + bean.toString());
		em.persist(bean);
		beanEventSrc.fire(bean);
		initNewCasal();
		return AliasNavigationRule.CASAL_LISTAR;
	}
	
	public void update() throws Exception {
		log.info("Atualizando" + bean.toString());
		em.persist(bean);
		beanEventSrc.fire(bean);
		initNewCasal();
	}
	
	public void delete() throws Exception {
		log.info("Excluindo " + bean.toString());
		em.persist(bean);
		beanEventSrc.fire(bean);
		initNewCasal();
	}
	
	@Produces
	@Named
	public Boolean getUpdateModeCasal() {
		return Boolean.FALSE;
	}

	@PostConstruct
	public void initNewCasal() {
		bean = new Casal();
	}
	
}
