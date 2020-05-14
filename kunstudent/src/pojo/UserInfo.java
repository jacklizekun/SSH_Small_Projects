package pojo;

public class UserInfo implements java.io.Serializable {

	private Integer id;

	private String userName;

	private Integer age;

	public UserInfo() {
	}

	public UserInfo(String userName, Integer age) {
		this.userName = userName;
		this.age = age;
	}


	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}