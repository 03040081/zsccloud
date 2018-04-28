package zsc.zzc.biz.Impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zsc.zzc.biz.UserBiz;
import zsc.zzc.dao.UserDao;
import zsc.zzc.entity.Login;
import zsc.zzc.entity.User;

@Service
public class UserBizImpl implements UserBiz {

	@Autowired
	private UserDao dao;
	
	@Override
	public User login(Map<Object, Object> map) {
		// TODO Auto-generated method stub
		return dao.login(map);
	}

	@Override
	public String insertLoginStatus(Login user) {
		// TODO Auto-generated method stub
		return dao.insertLoginStatus(user);
	}

}
