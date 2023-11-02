package threeWeek;
//예금
public class hsDeposit extends hsMoney{
	private int principal ;
	
	public int getPrincipal() {
		return principal;
	}

	public void setPrincipal(int principal) {
		this.principal = principal;
	}

	public hsDeposit(String name, String account_num, int date, double rate,int principal) {
		super(name, account_num, date, rate);
		this.principal = principal;
	}

	@Override
	public int cal() {
		return (int) (getPrincipal() * (1+(getRate()/12)*getDate()));
	}
	
	

}
