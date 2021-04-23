package com.christy.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.christy.hibernate.demo.entity.Instructor;
import com.christy.hibernate.demo.entity.InstructorDetail;

public class CreateDemo {
	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
				
		// create session
		Session session = factory.getCurrentSession();
		
try {			
			
			// create the objects
			Instructor tempInstructor1 = 
					new Instructor("Christy", "John", "christy.john@gmail.com");
			
			InstructorDetail tempInstructorDetail1 =
					new InstructorDetail(
							"http://www.codepilgrim.com",
							"Java Programming");		
			
			
			Instructor tempInstructor2 = 
					new Instructor("Cecil", "John", "cecil.john@outlook.com");
			
			InstructorDetail tempInstructorDetail2 =
					new InstructorDetail(
							"http://www.ceciljohn.com",
							"Guitar");		
			
			// associate the objects
			tempInstructor1.setInstructorDetail(tempInstructorDetail1);
			tempInstructor2.setInstructorDetail(tempInstructorDetail2);
			
			// start a transaction
			session.beginTransaction();
			
			// save the instructor
			//
			// Note: this will ALSO save the details object
			// because of CascadeType.ALL
			//
			System.out.println("Saving instructor: " + tempInstructor1);
			session.save(tempInstructor1);		
			System.out.println("Saving instructor: " + tempInstructor2);
			session.save(tempInstructor2);								
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}
}
