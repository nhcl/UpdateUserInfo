package com.hcl.phase3.updateFrom.service;

import java.util.Optional;

import com.hcl.phase3.updateFrom.model.User;

public interface UserService {
	public Optional<User> findone(Integer id);
	public User update(User u);
}
