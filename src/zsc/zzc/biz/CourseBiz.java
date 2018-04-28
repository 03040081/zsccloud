package zsc.zzc.biz;

import java.util.List;
import java.util.Map;

import zsc.zzc.entity.Course;

public interface CourseBiz {

	public List<Course> listCourses(Map<Object, Object> map);

	public List<String> listId();

	public List<Course> listRanCourse();

	public List<Course> listRanRecommend();
	
	//public Course selectByCourseId(String courseId);
}
