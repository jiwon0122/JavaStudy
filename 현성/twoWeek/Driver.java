package twoWeek;

public class Driver {
	 public static void main(String[] args) {
	        hsOverPayCalculator hsOverPayCalculator = new hsOverPayCalculator(8000);
	        hsOverPayCalculator.addweek_hour(50);
	        hsOverPayCalculator.setSaturdayWorkHours(6);
	        hsOverPayCalculator.setSundayWorkHours(2);
	        double overPay = hsOverPayCalculator.calculatePay();

	        hsDangerPayCalculator hsDangerPayCalculator = new hsDangerPayCalculator(10000);
	        hsDangerPayCalculator.addweek_hour(36);
	        hsDangerPayCalculator.setDangerWorkHours(6);
	        double dangerPay = hsDangerPayCalculator.calculatePay();

	        System.out.println("주말 근무 직원의 주급: " + overPay);
	        System.out.println("위험 근무 직원의 주급: " + dangerPay);
	    }
}
