package zsc.zzc.dao;

import java.util.List;
import java.util.Map;

import zsc.zzc.entity.Course;

public interface CourseDao {

	public List<Course> listCourses(Map<Object, Object> map);
	
	public List<String> listId();
	
	public List<Course> listRanCourse(List<String> itemId);
	
	public List<Course> listRanRecommend(List<String> itemId);
	
	/*public Course selectByCourseId(String id);*/
}
