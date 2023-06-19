package com.pranitproject.service;


import com.pranitproject.entity.FacebookUser;
import com.pranitproject.exception.UserNotFoundException;

public interface FacebookServiceInterface {

	FacebookUser createProfile(FacebookUser fb);

	FacebookUser viewProfile(String email)throws UserNotFoundException;

	void editProfile(FacebookUser fb);

	void deleteProfile(String em);

	FacebookUser loginUserService(String email, String password);

}
