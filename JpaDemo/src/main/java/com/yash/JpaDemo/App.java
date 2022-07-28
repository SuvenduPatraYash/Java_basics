package com.yash.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("Hello World!");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpasp");
		EntityManager em = emf.createEntityManager();
// System.out.println(s);
		s.setId(1);
		s.setName("jay");
		s.setCity("indore");
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		System.out.println(s);
	}
}