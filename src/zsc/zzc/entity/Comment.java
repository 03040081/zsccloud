package zsc.zzc.entity;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Comment {

	private String id;

	private String sectionId;

	private String userId;

	private String content;

	private Date createdTime;
	
	private User user;


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSectionId() {
		return sectionId;
	}

	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreatedTime() {
		return (new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")).format(this.createdTime);
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime=createdTime;
	}
}