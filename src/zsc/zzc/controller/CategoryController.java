package zsc.zzc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import zsc.zzc.biz.CategoryBiz;
import zsc.zzc.entity.Category;
import zsc.zzc.entity.VideoHttpResponse;

@Controller
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryBiz biz;
	
	@RequestMapping("/tag")
	@ResponseBody
	public VideoHttpResponse<List<Category>> getCategory(){
		VideoHttpResponse<List<Category>> httpResponse=new VideoHttpResponse<List<Category>>();
		List<Category> list=null;
		try {
			list=biz.selectCategoryAndChild();
			httpResponse.setCode(200);
			httpResponse.setRet(list);
		} catch (Exception e) {
			httpResponse.setMsg(e.getMessage());
			System.out.println(e.getMessage());
		}
		return httpResponse;
	}
}
