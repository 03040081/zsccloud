package zsc.zzc.dao;

import java.util.List;

import zsc.zzc.entity.Category;

public interface CategoryDao {
	
	public List<Category> selectCategoryAndChild();
}
