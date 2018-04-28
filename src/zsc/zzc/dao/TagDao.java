package zsc.zzc.dao;

import java.util.List;

import zsc.zzc.entity.Tag;

public interface TagDao {

	public List<Tag> selectTagByCourseId(String courseId);
	
}
