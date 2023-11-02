package threeWeek;

//예금 복리 
public class hsCompound extends hsDeposit{

	public hsCompound(String name, String account_num, int date, double rate, int principal) {
		super(name, account_num, date, rate, principal);
	}

	@Override
	public int cal() {
		return (int) (getPrincipal()*Math.pow(1+(getRate()/12),getDate()));
	}

}
