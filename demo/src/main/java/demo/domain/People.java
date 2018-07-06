package demo.domain;

import java.io.Serializable;

public class People implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3841495173786526646L;

	private String userName;
	
	private String sex;
	
	private String hobby;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "People [userName=" + userName + ", sex=" + sex + ", hobby=" + hobby + "]";
	}
	
	
	
}
