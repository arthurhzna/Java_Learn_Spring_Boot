package com.learnspringboot.learn_jpa_and_hibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.learnspringboot.learn_jpa_and_hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository // @Entity //<-----repository can  using this class
@Transactional //<-- to make the transaction
public class CourseJpaRepository {
	
	@PersistenceContext //<-- to get the entity manager
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}

	public void deleteById(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}

}
