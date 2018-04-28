package zsc.zzc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import zsc.zzc.biz.CourseBiz;
import zsc.zzc.entity.Course;
import zsc.zzc.entity.VideoHttpResponse;

@Controller
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseBiz biz;
	
	@RequestMapping("/dbcourse")
	@ResponseBody
	public VideoHttpResponse<List<Course>> getCourse(
			String tag_id,String profession_id,Integer currPage){
		VideoHttpResponse<List<Course>> httpResponse=new VideoHttpResponse<List<Course>>();
		List<Course> list=null;
		try{
			Map<Object, Object> map=new HashMap<Object, Object>();
			
			if(!"".equals(tag_id)&&tag_id!=null){
				map.put("tag_id", tag_id);
			}else{
				map.put("profession_id", profession_id);
			}
			map.put("currPage", (currPage-1)*10);
			list=biz.listCourses(map);
			httpResponse.setCode(200);
			httpResponse.setRet(list);
		}catch(Exception e){
			httpResponse.setMsg(e.getMessage());
			System.out.println(e.getMessage());
		}
		return httpResponse;
	}
	
	@RequestMapping("/dbcourseByName")
	@ResponseBody
	public VideoHttpResponse<List<Course>> getCourseByName(String name,Integer currPage){
		VideoHttpResponse<List<Course>> httpResponse=new VideoHttpResponse<List<Course>>();
		List<Course> list=null;
		try{
			Map<Object, Object> map=new HashMap<Object, Object>();
			map.put("name", name);
			map.put("currPage", (currPage-1)*10);
			System.out.println(map);
			list=biz.listCourses(map);
			httpResponse.setCode(200);
			httpResponse.setRet(list);
		}catch(Exception e){
			httpResponse.setMsg(e.getMessage());
			System.out.println(e.getMessage());
		}
		return httpResponse;
	}
	
	@RequestMapping("/dbcourseById")
	@ResponseBody
	public VideoHttpResponse<List<Course>> getCourseById(String id){
		VideoHttpResponse<List<Course>> httpResponse=new VideoHttpResponse<List<Course>>();
		List<Course> list=null;
		try{
			Map<Object, Object> map=new HashMap<Object, Object>();
			map.put("id", id);
			System.out.println(map);
			list=biz.listCourses(map);
			httpResponse.setCode(200);
			httpResponse.setRet(list);
		}catch(Exception e){
			httpResponse.setMsg(e.getMessage());
			System.out.println(e.getMessage());
		}
		return httpResponse;
	}
	
	@RequestMapping("/rollcourse")
	@ResponseBody
	public VideoHttpResponse<List<Course>> getRollCourse(){
		VideoHttpResponse<List<Course>> httpResponse=new VideoHttpResponse<List<Course>>();
		List<Course> list=null;
		try{
			list=biz.listRanCourse();
			httpResponse.setCode(200);
			httpResponse.setRet(list);
		}catch(Exception e){
			httpResponse.setMsg(e.getMessage());
		}
		return httpResponse;
	}
	
	@RequestMapping("/recommendcourse")
	@ResponseBody
	public VideoHttpResponse<List<Course>> getRecommendCourse(){
		VideoHttpResponse<List<Course>> httpResponse=new VideoHttpResponse<List<Course>>();
		List<Course> list=null;
		try{
			list=biz.listRanRecommend();
			httpResponse.setCode(200);
			httpResponse.setRet(list);
		}catch(Exception e){
			httpResponse.setMsg(e.getMessage());
			System.out.println(e.getMessage());
		}
		return httpResponse;
	}
	
	/*@RequestMapping("/detailed")
	@ResponseBody
	public VideoHttpResponse<Course> getDetailed(String courseId){
		VideoHttpResponse<Course> httpResponse=new VideoHttpResponse<Course>();
		Course course=null;
		try{
			course=biz.selectByCourseId(courseId);
			httpResponse.setCode(200);
			httpResponse.setRet(course);
		}catch(Exception e){
			httpResponse.setMsg(e.getMessage());
		}
		return httpResponse;
	}*/
	
	@RequestMapping("/test")
	@ResponseBody
	public List<String> listss(){
		return biz.listId();
	}
}
