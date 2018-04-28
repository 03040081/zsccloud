package zsc.zzc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import zsc.zzc.biz.UserBiz;
import zsc.zzc.entity.User;
import zsc.zzc.entity.VideoHttpResponse;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserBiz biz;
	
	@RequestMapping("/login")
	@ResponseBody
	public VideoHttpResponse<User> login(String useraccout,String password){
		VideoHttpResponse<User> httpResponse=new VideoHttpResponse<User>();
		User user=null;

		try{
			Map<Object, Object> map=new HashMap<Object, Object>();
			
			map.put("useraccout", useraccout);
			map.put("password", password);
			user=biz.login(map);
			httpResponse.setCode(200);
			httpResponse.setRet(user);
		}catch(Exception e){
			httpResponse.setMsg(e.getMessage());
			System.out.println(e.getMessage());
		}
		return httpResponse;
	}
	
	
}
