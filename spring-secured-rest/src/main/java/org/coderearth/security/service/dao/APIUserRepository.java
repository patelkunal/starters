package org.coderearth.security.service.dao;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public class APIUserRepository {

	public UserDetails findUser(String username) {
		APIUser user = new APIUser();
		return user;
	}

}
