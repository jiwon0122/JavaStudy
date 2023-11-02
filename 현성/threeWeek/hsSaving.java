package threeWeek;

//적금
public class hsSaving extends hsMoney {
	private int principal;

	// 월 불입액
	public hsSaving(String name, String account_num, int date, double rate, int principal) {
		super(name, account_num, date, rate);
		this.principal = principal;
	}

	@Override
	public int cal() {
		return (int) ((getPrincipal() * getDate()) + getPrincipal() * (getRate() / 12) * ((getDate() * (getDate() + 1)) / 2));
	}

	public int getPrincipal() {
		return principal;
	}

	public void setPrincipal(int principal) {
		this.principal = principal;
	}

}
