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
import br.com.w11.amjus.model.Encontro;

/**
 * @author root
 * 
 */
@Stateful
@Model
public class EncontroCadastro {

	@Inject
	private Logger log;

	@Inject
	private EntityManager em;

	@Inject
	private Event<Encontro> beanEventSrc;
	
	private Encontro bean;

	@Produces
	@Named
	public Encontro getBean() {
		return bean;
	}
	
	public String insert() throws Exception {
		log.info("Cadastrando " + bean.getNome());
		em.persist(bean);
		beanEventSrc.fire(bean);
		initNewEncontro();
		return AliasNavigationRule.ENCONTRO_LISTAR;
	}
	
	public void update() throws Exception {
		log.info("Atualizando" + bean.getNome());
		em.persist(bean);
		beanEventSrc.fire(bean);
		initNewEncontro();
	}
	
	public void delete() throws Exception {
		log.info("Excluindo " + bean.getNome());
		em.persist(bean);
		beanEventSrc.fire(bean);
		initNewEncontro();
	}
	
	@Produces
	@Named
	public Boolean getUpdateMode() {
		return Boolean.FALSE;
	}

	@PostConstruct
	public void initNewEncontro() {
		bean = new Encontro();
	}
}
