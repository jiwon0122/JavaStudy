package study5;

public class Register {
    private Student student;
    private Course course;

    public Register(Student student, Course course) {
        this.student = student;
        this.course = course;

        // 수강 인원수 증가 및 학점 체크
        if (course.getCurrentEnrollment() < course.getMaxEnrollment() &&
                student.getCurrentCredits() + course.getCredits() <= student.getMaxCredits()) {
            course.enrollStudent();
            student.enrollCredits(course.getCredits());
        } else if (course.getCurrentEnrollment() >= course.getMaxEnrollment()) {
            System.out.println("정원이 차서 수강 신청할 수 없다.");
        } else {
            System.out.println("학점 초과로 수강 신청할 수 없다.");
        }
    }

    public String getRegistrationInfo() {
        return student.getName() + ": " + course.getCourseName() + " 수강 신청";
    }
}

