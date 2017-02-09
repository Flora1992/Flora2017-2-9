package user.domain;

public class User {
	private int id;
	private String account;
	private String nickName;
	private String password;
	private int age;
	private String sex;
	private String headImg;//保存头像路径
	//用户注册、通过id查看用户个人信息
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getHeadImag() {
		return headImg;
	}
	public void setHeadImag(String headImag) {
		this.headImg = headImag;
	}
	@Override
	public String toString() {
		return "User [account=" + account + ", nickName=" + nickName + ", password=" + password
				+ ", age=" + age + ", sex=" + sex + ", headImg=" + headImg + "]";
	}
	
	
	

}
