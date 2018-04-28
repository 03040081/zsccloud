package zsc.zzc.dao;

import java.util.List;

import zsc.zzc.entity.Profession;

public interface ProfessionDao {

	public List<Profession> selectProfessionByCollegeId(String collegeId);
	
	public Profession selectProfessionById(String id);
}
