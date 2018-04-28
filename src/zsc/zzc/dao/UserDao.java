package zsc.zzc.dao;

import java.util.Map;

import zsc.zzc.entity.Login;
import zsc.zzc.entity.User;

public interface UserDao {

	public User login(Map<Object, Object> map);
	
	public String insertLoginStatus(Login user);
	
	public User selectUserById(String id);
}
