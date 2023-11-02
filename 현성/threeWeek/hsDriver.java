package threeWeek;

public class hsDriver {

	public static void main(String[] args) {
		hsSimple man = new hsSimple("선남","100",12,0.05,10000000);
		hsCompound woman = new hsCompound("선녀","200",12,0.05,10000000);
		hsSaving human = new hsSaving("길동","300",12,0.05,100000);
		
		System.out.println("정기예금(단리)");
		System.out.println("예금주 이름: "+ man.getName());
		System.out.println("계좌번호: "+man.getAccount_num());
		System.out.println("연이율: "+man.getRate());
		System.out.println("원금: "+man.getPrincipal());
		System.out.println("원리금: "+man.cal()+"\n");
		
		
		System.out.println("정기예금(복리)");
		System.out.println("예금주 이름: "+ woman.getName());
		System.out.println("계좌번호: "+woman.getAccount_num());
		System.out.println("연이율: "+woman.getRate());
		System.out.println("원금: "+woman.getPrincipal());
		System.out.println("원리금: "+woman.cal()+"\n");
		
		System.out.println("정기적금");
		System.out.println("예금주 이름: "+ human.getName());
		System.out.println("계좌번호: "+human.getAccount_num());
		System.out.println("연이율: "+human.getRate());
		System.out.println("월불입액: "+human.getPrincipal());
		System.out.println("원리금: "+human.cal()+"\n");
		
	}

}
