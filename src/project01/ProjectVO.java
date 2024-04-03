package project01;

public class ProjectVO {
	private int idx;
	private String id;
	private String password;
	private String name;
	private String Birthday;
	private String gender;
	private String phonenumber;

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return Birthday;
	}

	public void setBirthday(String birthday) {
		Birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "ProjectVO [idx=" + idx + ", id=" + id + ", password=" + password + ", name=" + name + ", Birthday="
				+ Birthday + ", gender=" + gender + ", phonenumber=" + phonenumber + ", getIdx()=" + getIdx() + ", getId()="
				+ getId() + ", getPassword()=" + getPassword() + ", getName()=" + getName() + ", getBirthday()=" + getBirthday()
				+ ", getGender()=" + getGender() + ", getPhonenumber()=" + getPhonenumber() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	


}