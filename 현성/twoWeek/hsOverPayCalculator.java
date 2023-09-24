package twoWeek;

public class hsOverPayCalculator extends hsBasicPayCalculator {
	 double saturdayWorkHours; // 토요일 근무 시간 
	 double sundayWorkHours; // 일요일 근무 시간 

	    public hsOverPayCalculator(double work_hour) {
	        super(work_hour);
	        this.saturdayWorkHours = 0;
	        this.sundayWorkHours = 0;
	    }

	    public void setSaturdayWorkHours(double hours) {
	        this.saturdayWorkHours = hours;
	    }

	    public void setSundayWorkHours(double hours) {
	        this.sundayWorkHours = hours;
	    }

	    @Override
	    public double calculatePay() {
	        double weekdayPay = super.calculatePay();
	        double saturdayPay = saturdayWorkHours * work_hour * 2;
	        double sundayPay = sundayWorkHours * work_hour * 3;

	        return weekdayPay + saturdayPay + sundayPay;
	    }
}
