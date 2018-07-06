package demo.domain;

import java.util.Date;

public class BlogType {

	private Integer id;
	
	private String btId;
	
	private String userId;
	
	private String typeTxt;
	
	private Date crtTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBtId() {
		return btId;
	}

	public void setBtId(String btId) {
		this.btId = btId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTypeTxt() {
		return typeTxt;
	}

	public void setTypeTxt(String typeTxt) {
		this.typeTxt = typeTxt;
	}

	public Date getCrtTime() {
		return crtTime;
	}

	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}

	@Override
	public String toString() {
		return "BlogType [id=" + id + ", btId=" + btId + ", userId=" + userId + ", typeTxt=" + typeTxt + ", crtTime="
				+ crtTime + "]";
	}
	
	
}
