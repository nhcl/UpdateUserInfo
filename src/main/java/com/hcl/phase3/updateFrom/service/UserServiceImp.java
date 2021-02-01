package com.hcl.phase3.updateFrom.service;

import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.phase3.updateFrom.model.User;
import com.hcl.phase3.updateFrom.model.UserRepository;

@Transactional
@Service("UserService")
public class UserServiceImp implements UserService {
	@Autowired
	private UserRepository UserRepository;

	@Override
	public Optional<User> findone(Integer id) {
		return UserRepository.findById(id);
		
	}

	@Override
	public User update(User user) {
		return UserRepository.save(user);
	}
}
