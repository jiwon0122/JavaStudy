package twoWeek;

public class hsBasicPayCalculator {
	double work_hour; //시간당 임금 
    double week_hour; //평일 근무 시간  

    public hsBasicPayCalculator(double work_hour) {
        this.work_hour = work_hour;
        this.week_hour = 0;
    }

    public void addweek_hour(double hours) {
        this.week_hour += hours;
    }

    public void setwork_hour(double work_hour) {
        this.work_hour = work_hour;
    }

    public double calculatePay() {
        if (week_hour <= 40) {
            return week_hour * work_hour;
        } else {
            double overtimePay = (week_hour - 40) * work_hour * 1.5;
            return 40 * work_hour + overtimePay;
        }
    }
	
}
