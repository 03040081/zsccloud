package zsc.zzc.biz;

import java.util.List;

import zsc.zzc.entity.Category;

public interface CategoryBiz {

	public List<Category> selectCategoryAndChild();
}
