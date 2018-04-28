package zsc.zzc.biz.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zsc.zzc.biz.CategoryBiz;
import zsc.zzc.dao.CategoryDao;
import zsc.zzc.entity.Category;

@Service
public class CategoryBizImpl implements CategoryBiz {

	@Autowired
	private CategoryDao dao;
	
	@Override
	public List<Category> selectCategoryAndChild() {
		return dao.selectCategoryAndChild();
	}

}
