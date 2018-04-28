package zsc.zzc.biz.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zsc.zzc.biz.CollegeBiz;
import zsc.zzc.dao.CollegeDao;
import zsc.zzc.entity.College;

@Service
public class CollegeBizImpl implements CollegeBiz {

	@Autowired
	private CollegeDao dao;
	
	@Override
	public List<College> listColleges() {
		// TODO Auto-generated method stub
		return dao.listColleges();
	}

}
