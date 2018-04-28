package zsc.zzc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import zsc.zzc.entity.Section;


public interface SectionDao {

	public List<Section> listSections(String id);
	
	public List<Section> selectChaptersByCourseId(String id);
	
	public List<Section> selectDetailedsForChapter(@Param("courseId")String courseId,@Param("index")int index);
	
}
