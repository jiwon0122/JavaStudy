package threeWeek;

public class hsMoney {
	private String name;
	private String account_num;
	
	private int date;
	private double rate;
	
	public int cal() {
		return 0;
	}
	
	public hsMoney(String name, String account_num, int date, double rate) {
		this.name = name;
		this.account_num = account_num;
		this.date = date;
		this.rate = rate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount_num() {
		return account_num;
	}
	public void setAccount_num(String account_num) {
		this.account_num = account_num;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
}
