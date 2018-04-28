package zsc.zzc.entity;

import java.util.List;

public class College {
   
    private String id;

    private String name;
    
    private List<Profession> listProfessions; 

    public String getId() {
        return id;
    }
  
    public void setId(String id) {
        this.id = id;
    }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public List<Profession> getListProfessions() {
		return listProfessions;
	}

	public void setListProfessions(List<Profession> listProfessions) {
		this.listProfessions = listProfessions;
	}
}