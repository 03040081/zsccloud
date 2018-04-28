package zsc.zzc.entity;

import java.util.List;

public class Category {

    private String id;

    private String name;
    
    private List<Tag> listTags;

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

	public List<Tag> getListTags() {
		return listTags;
	}

	public void setListTags(List<Tag> listTags) {
		this.listTags = listTags;
	}
}