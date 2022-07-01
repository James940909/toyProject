package model.food;

public class foodVO {
	//getter, setter ¼³Á¤
	private int f_num;
	private String f_name;
	private int f_price;
	public int getF_num() {
		return f_num;
	}
	public void setF_num(int f_num) {
		this.f_num = f_num;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public int getF_price() {
		return f_price;
	}
	public void setF_price(int f_price) {
		this.f_price = f_price;
	}
	
	@Override
	public String toString() {
		return "foodVO [f_num=" + f_num + ", f_name=" + f_name + ", f_price=" + f_price + "]";
	}
	
}
