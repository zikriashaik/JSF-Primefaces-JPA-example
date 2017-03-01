package com.jh.pf.mb;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jh.pf.eb.Editor;

@ManagedBean(name = "editor")
public class EditorBean {

	private String value = "This editor is provided by PrimeFaces";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	public void save(){
		System.out.println("save mmmmm");
		Editor e = new Editor();
		e.setValue(value);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JSFCrudPU");
		EntityManager em  = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
	}
}