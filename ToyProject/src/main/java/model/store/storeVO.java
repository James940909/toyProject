package model.store;

public class storeVO {
	private int s_num;
	private String s_name;
	private String s_category;
	private String s_address;
	private int s_reviewCnt;
	
	public int getS_num() {
		return s_num;
	}
	public void setS_num(int s_num) {
		this.s_num = s_num;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_category() {
		return s_category;
	}
	public void setS_category(String s_category) {
		this.s_category = s_category;
	}
	public String getS_address() {
		return s_address;
	}
	public void setS_address(String s_address) {
		this.s_address = s_address;
	}
	public int getS_reviewCnt() {
		return s_reviewCnt;
	}
	public void setS_reviewCnt(int s_reviewCnt) {
		this.s_reviewCnt = s_reviewCnt;
	}
	
	@Override
	public String toString() {
		return "storeVO [s_num=" + s_num + ", s_name=" + s_name + ", s_category=" + s_category + ", s_address="
				+ s_address + ", s_reviewCnt=" + s_reviewCnt + "]";
	}
	
	
}
