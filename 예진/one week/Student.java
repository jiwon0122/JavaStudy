package study5;

public class Student {
    private String studentID;
    private String name;
    private int maxCredits;
    private int currentCredits;

    public Student(String studentID, String name, int maxCredits) {
        this.studentID = studentID;
        this.name = name;
        this.maxCredits = maxCredits;
        this.currentCredits = 0;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public double getMaxCredits() {
        return maxCredits;
    }

    public double getCurrentCredits() {
        return currentCredits;
    }

    public String getStudentInfo() {
        return studentID + "\t" + name + "\t\t" + currentCredits;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxCredits(int maxCredits) {
        this.maxCredits = maxCredits;
    }

    public void enrollCredits(double credits) {
        if (currentCredits + credits <= maxCredits) {
            currentCredits += credits;
        } else {
            System.out.println("최대 신청 학점수를 초과하였습니다.");
        }
    }
}

