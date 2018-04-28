package zsc.zzc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import zsc.zzc.biz.CollegeBiz;
import zsc.zzc.entity.College;
import zsc.zzc.entity.VideoHttpResponse;

@Controller
@RequestMapping("/college")
public class CollegeController {

	@Autowired
	private CollegeBiz biz;
	
	@RequestMapping("/peofession")
	@ResponseBody
	public VideoHttpResponse<List<College>> getColleges(){
		VideoHttpResponse<List<College>> httpResponse=new VideoHttpResponse<List<College>>();
		List<College> list=null;
		try{
			list=biz.listColleges();
			httpResponse.setCode(200);
			httpResponse.setRet(list);
		}catch(Exception e){
			httpResponse.setMsg(e.getMessage());
			System.out.println(e.getMessage());
		}
		return httpResponse;
	}
}
