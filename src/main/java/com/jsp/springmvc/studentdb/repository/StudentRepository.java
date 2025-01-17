package com.jsp.springmvc.studentdb.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.jsp.springmvc.studentdb.entity.Student;

@Repository
public class StudentRepository {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");

	public void addStudnet(Student student) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		//Save
		em.persist(student);

		et.commit();
		em.close();

	}

}
