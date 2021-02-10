package com.christy.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.christy.hibernate.demo.entity.Student;

public class QueryStudentDemo {
	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {				
			// start a transaction
			session.beginTransaction();
			
			// query students
			List<Student> theStudents = session.createQuery("from Student").getResultList();

			// display the students
			displayStudents(theStudents);
			
			// query stuednts: lastName = 'Eliz'
			theStudents = session.createQuery("from Student s where s.lastName ='Eliz'").getResultList();

			// display the students
			System.out.println("\n\nStudents who have last name of Eliz");
			displayStudents(theStudents);
			
			// query students: lastName ='Eliz' OR firstName='Daffy'
			theStudents = 
					session.createQuery("from Student s where s.lastName ='Eliz'" +
							" OR s.firstName='Daffy'").getResultList();
			
			// display the students
			System.out.println("\n\nStudents who have last name of Eliz OR first name of Daffy");
			displayStudents(theStudents);
			
			// query students: email LIKE 'gmail.com'
			theStudents = 
					session.createQuery("from Student s where s.email LIKE " +
							" '%gmail.com'").getResultList();
			
			// display the students
			System.out.println("\n\nStudents who have email LIKE 'gmail.com'");
			displayStudents(theStudents);
						
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("\nDone!");
		} finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}
}
