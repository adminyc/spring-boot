package cn.cssl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.cssl.dao.UserDao;
import cn.cssl.pojo.User;
import cn.cssl.service.MyService;

@Service
@Transactional
public class MyServiceImpl implements MyService{
	@Autowired
	private UserDao ud;
	
	public int adduser(User ur) {
		return ud.insertUsers(ur);
	}
	
}
