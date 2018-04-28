package zsc.zzc.biz;

import java.util.Map;

import zsc.zzc.entity.Login;
import zsc.zzc.entity.User;

public interface UserBiz {

	public User login(Map<Object, Object> map);

	public String insertLoginStatus(Login user);
}
