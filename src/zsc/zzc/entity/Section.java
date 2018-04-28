package zsc.zzc.entity;

import java.util.Comparator;
import java.util.List;

public class Section implements Comparator {

	private String id;

	private String courseId;

	private String title;

	private Integer index;

	private String subTitle;

	private Integer subIndex;
	
	private List<Section> listChapter;

	/*public Section(String id, String courseId, String title, Integer index, String subTitle, Integer subIndex) {
		this.id = id;
		this.courseId = courseId;
		this.title = title;
		this.index = index;
		this.subTitle = subTitle;
		this.subIndex = subIndex;
	}*/

	public List<Section> getListChapter() {
		return listChapter;
	}

	public void setListChapter(List<Section> listChapter) {
		this.listChapter = listChapter;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String getCourseId() {
		return courseId;
	}

	
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}


	public String getTitle() {
		return title;
	}

	
	public void setTitle(String title) {
		this.title = title;
	}


	public Integer getIndex() {
		return index;
	}


	public void setIndex(Integer index) {
		this.index = index;
	}


	public String getSubTitle() {
		return subTitle;
	}


	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}


	public Integer getSubIndex() {
		return subIndex;
	}


	public void setSubIndex(Integer subIndex) {
		this.subIndex = subIndex;
	}

	@Override
	public int compare(Object o1, Object o2) {
		Section sec1=(Section)o1;
		Section sec2=(Section)o2;
		
		return sec1.getIndex()-sec2.getIndex();
	}
}