package study5;

public class Course {
    private static int totalCount = 0; // 생성된 Course 객체들의 수를 저장하는 정적 변수
    private String courseName;
    private int maxEnrollment;
    private int currentEnrollment;
    private double credits;

    public Course(String courseName, int maxEnrollment, double credits) {
        this.courseName = courseName;
        this.maxEnrollment = maxEnrollment;
        this.currentEnrollment = 0;
        this.credits = credits;
        totalCount++; // Course 객체가 생성될 때마다 수를 증가
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMaxEnrollment() {
        return maxEnrollment;
    }

    public int getCurrentEnrollment() {
        return currentEnrollment;
    }

    public double getCredits() {
        return credits;
    }

    public static int getTotalCourseCount() {
        return totalCount;
    }

    public String getCourseInfo() {
        return courseName + "\t" + maxEnrollment + "\t\t\t" + currentEnrollment;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setMaxEnrollment(int maxEnrollment) {
        this.maxEnrollment = maxEnrollment;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public void increaseMaxEnrollment(int amount) {
        this.maxEnrollment += amount;
    }

    public void enrollStudent() {
        if (currentEnrollment < maxEnrollment) {
            currentEnrollment++;
        } else {
            System.out.println("수강 인원이 최대치에 도달했습니다.");
        }
    }

    public void dropStudent() {
        if (currentEnrollment > 0) {
            currentEnrollment--;
        } else {
            System.out.println("수강 인원이 0입니다.");
        }
    }
}
