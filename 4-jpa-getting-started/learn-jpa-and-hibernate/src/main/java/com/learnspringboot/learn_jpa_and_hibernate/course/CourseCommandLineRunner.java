package com.learnspringboot.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learnspringboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.learnspringboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;
// import com.learnspringboot.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;


@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJpaRepository repository; <-- this is using CourseJpaRepository entity

	@Autowired
	private CourseSpringDataJpaRepository repository;

	// private CourseJdbcRepository repository; <-- this is using CourseJdbcRepository
	
	@Override
	public void run(String... args) throws Exception {
		// repository.insert(new Course(1, "Learn AWS Now", "hozanna.site"));   <----  because entitiy, now we can EntityManager, so we can use save()
		// public void insert(Course course) {  <---- receive object from Course.java
		// 	springJdbcTemplate.update(INSERT_QUERY, 
		// 			course.getId(), course.getName(), course.getAuthor());
		// }
		repository.save(new Course(1, "Learn AWS Jpa!", "hozanna.site"));  // <----  because entitiy, now we can EntityManager, so we can use save()
		repository.save(new Course(2, "Learn Azure Jpa!", "hozanna.site"));
		repository.save(new Course(3, "Learn DevOps Jpa!", "hozanna.site"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("in28minutes"));
		System.out.println(repository.findByAuthor(""));

		System.out.println(repository.findByName("Learn AWS Jpa!"));
		System.out.println(repository.findByName("Learn DevOps Jpa!"));

		
	}

}
