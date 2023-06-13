package com.pranitproject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.pranitproject.dao.FacebookDAOInterface;
import com.pranitproject.entity.FacebookUser;

@Service
@Scope("prototype")
public class FacebookService implements FacebookServiceInterface {
	
	@Autowired
	private FacebookDAOInterface fd;

	@Override
	public FacebookUser createProfile(FacebookUser fb) {
		fd.save(fb);
		return fb;
	}

	@Override
	public FacebookUser viewProfile(String email) {
		FacebookUser f1=null;
		Optional<FacebookUser> oo=  fd.findById(email);
		if(oo.isPresent()) {
			f1= oo.get();
		}
		return f1;
		
	}

	@Override
	public void editProfile(FacebookUser fb) {
		fd.saveAndFlush(fb);
		
	}

	@Override
	public void deleteProfile(String em) {
		fd.deleteById(em);
	}

}
