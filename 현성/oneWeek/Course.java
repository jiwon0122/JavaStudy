package oneWeek;

public class Course {
    private String subject;
    private int max;        //최대 수강 인원수
    private int score;      //학점수
    private int student;    //수강 인원수

    static int count;

    public Course(String subject, int max, int score) {
        this.subject = subject;
        this.max = max;
        this.score = score;
        this.student=0;
        count++;
    }

    @Override
    public String toString() {
        return subject
                + '\t'
                +max
                + '\t'
                + student;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max += max;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
