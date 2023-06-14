package com.pranitproject.service;

import com.pranitproject.entity.FacebookUser;

public interface FacebookServiceInterface {

	FacebookUser createProfile(FacebookUser fb);

	FacebookUser viewProfile(String email);

	void editProfile(FacebookUser fb);

	void deleteProfile(String em);

	FacebookUser loginUserService(String email, String password);

}
