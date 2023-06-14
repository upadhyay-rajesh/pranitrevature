package com.hibernatepranit;

import javax.persistence.EntityTransaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernatepranit.entity.PranitEntity;

public class App {
	public static void main(String[] args) {
		App a=new App();
		a.createProfile();
	}

	public void createProfile() {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		
		PranitEntity p=new PranitEntity();
		p.setName("pranit");
		p.setPassword("pppp");
		p.setEmail("abc@yahoo.com");
		p.setAddress("Bangalore");
		
		EntityTransaction et=s.getTransaction();
		et.begin();
		s.save(p);
		et.commit();
		System.out.println("object saved");
	}

	public void editProfile() {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
	}

	public void deleteProfile() {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
	}

	public void viewProfile() {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
	}
}
