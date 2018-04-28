package zsc.zzc.biz.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zsc.zzc.biz.CourseBiz;
import zsc.zzc.dao.CourseDao;
import zsc.zzc.dao.SectionDao;
import zsc.zzc.entity.Course;
import zsc.zzc.entity.Section;

@Service
public class CourseBizImpl implements CourseBiz {

	@Autowired
	private CourseDao dao;
	
	@Autowired
	private SectionDao sectionDao;
	
	@Override
	public List<Course> listCourses(Map<Object, Object> map) {
		
		List<Course> list=dao.listCourses(map);
		
		int n=list.size();
		for(int i=0;i<n;i++){
			List<Section> listSections=list.get(i).getListSections();
			int m=listSections.size();
			for(int j=0;j<m;j++){
				List<Section> listChapter=null;
				String courseId=listSections.get(j).getCourseId();
				int index=listSections.get(j).getIndex();
				listChapter=sectionDao.selectDetailedsForChapter(courseId, index);
				listSections.get(j).setListChapter(listChapter);
			}
		}
		
		/*System.out.println("¿Î³ÌCourse  "+list.size());
		System.out.println("Section  "+list.get(0).getListSections().size());
		int sum=0;
		for(int i=0;i<list.get(0).getListSections().size();i++)
		{
			sum+=list.get(0).getListSections().get(i).getListChapter().size();
		}
		System.out.println("½Ú &&  "+sum);*/
		//List<Section> sections=list.get(0).getListSections();
		/*int n=list.size();
		for(int i=0;i<n;i++){
			List<Section> listsSections=list.get(i).getListSections();
			int len=listsSections.size();
			List<Character> listCharacters=null;
			for(int j=0;j<len;j++){
				
			}
		}*/
		
		return list;
	}

	@Override
	public List<String> listId() {
		// TODO Auto-generated method stub
		return dao.listId();
	}

	@Override
	public List<Course> listRanCourse() {
		int n=listId().size();
		int num=6;
		if(n<num)
			num=n;
		List<String> itemId=listRanStr(num);
		return dao.listRanCourse(itemId);
	}

	@Override
	public List<Course> listRanRecommend() {
		int n=listId().size();
		int num=10;
		if(n<num)
			num=n;
		List<String> itemId=listRanStr(num);
		return dao.listRanRecommend(itemId);
	}
	
	private List<String> listRanStr(int size){
		List<String> list=listId();
		int n=list.size();
		List<String> liststr=new ArrayList<String>();
		for(int i=0;i<size;i++){
			int index=(int)(Math.random()*n);
			liststr.add(list.get(index));
		}
		System.out.println(liststr);
		return liststr;
	}

	/*@Override
	public Course selectByCourseId(String courseId) {
		
		return dao.selectByCourseId(courseId);
	}*/
}
