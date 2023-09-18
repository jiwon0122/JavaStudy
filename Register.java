package oneWeek;

public class Register {
    private Course course;
    private Student student;

    public Register(Course course, Student student) {
        this.course = course;
        this.student = student;
    }
    public void doCourseRegister(Student st, Course cs){
        if(course.getStudent() < course.getMax()) {
            int score = student.getScore();
            score+= course.getScore();
            student.setScore(score);
            if(student.getScore()> student.getMax()){
                System.out.println("학점 초과로 수강 신청할 수 없다.");
            }
            int plus =1;
            plus += course.getStudent();
            course.setStudent(plus);
        }else{
            System.out.println("정원이 차서 수강 신청할 수 없다.");
        }

    }

    @Override
    public String toString() {
        return student.getName() + ": " + course.getSubject() + "수강 신청";
    }
}
