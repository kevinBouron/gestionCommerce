package com.fr.gestion.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.gestion.DAO.IUserDao;
import com.fr.gestion.entities.User;

@Service
public class UserService implements IUserService{

	@Autowired
	IUserDao dao ;
	@Override
	public User findOneById(Long id) {
		// TODO Auto-generated method stub
		return dao.getOne(id);
	}

	@Override
	public User save(User p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public void delete(User p) {
		// TODO Auto-generated method stub
		dao.delete(p);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public User findOneByLOgin(String login) {
		// TODO Auto-generated method stub
		return dao.findOneByUserName(login);
	}
	
	

	
	
	
	
}
