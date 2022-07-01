package model.users;

public class usersVO {
	//getter, setter ¼³Á¤
	private int u_num;
	private String u_id;
	private String u_password;
	private String u_email;
	private String u_phoneNumber;
	private String u_profile;
	
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public int getU_num() {
		return u_num;
	}
	public void setU_num(int u_num) {
		this.u_num = u_num;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	public String getU_email() {
		return u_email;
	}
	public void setU_email(String u_email) {
		this.u_email = u_email;
	}
	public String getU_phoneNumber() {
		return u_phoneNumber;
	}
	public void setU_phoneNumber(String u_phoneNumber) {
		this.u_phoneNumber = u_phoneNumber;
	}
	public String getU_profile() {
		return u_profile;
	}
	public void setU_profile(String u_profile) {
		this.u_profile = u_profile;
	}
	@Override
	public String toString() {
		return "usersVO [u_num=" + u_num + ", u_id=" + u_id + ", u_password=" + u_password + ", u_email=" + u_email
				+ ", u_phoneNumber=" + u_phoneNumber + ", u_profile=" + u_profile + "]";
	}
	
}
