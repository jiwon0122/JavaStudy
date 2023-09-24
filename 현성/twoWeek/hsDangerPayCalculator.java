package twoWeek;

class hsDangerPayCalculator extends hsBasicPayCalculator {
    double dangerWorkHours;

    public hsDangerPayCalculator(double hourlyRate) {
        super(hourlyRate);
        this.dangerWorkHours = 0;
    }

    public void setDangerWorkHours(double hours) {
        this.dangerWorkHours = hours;
    }

    @Override
    public double calculatePay() {
        double weekdayPay = super.calculatePay();
        double dangerPay = dangerWorkHours * work_hour * 5;

        return weekdayPay + dangerPay;
    }
}
