package study5;

public class Driver2 {
    public static void main(String[] args) {
        // 교과목 생성
        Course algorithmCourse = new Course("알고리즘", 30, 4);
        Course dataStructureCourse = new Course("자료구조", 25, 3);

        System.out.println("수강 신청전\n");

        // 교과목 정보 출력
        System.out.println("교과목명\t최대 학생수\t현재 학생수");
        System.out.println(algorithmCourse.getCourseInfo());
        System.out.println(dataStructureCourse.getCourseInfo());

        // 교과목 최대 수강 인원수 증가
        algorithmCourse.increaseMaxEnrollment(6);
        dataStructureCourse.increaseMaxEnrollment(3);

        System.out.println("\n수강 인원 증원후\n");

        // 교과목 정보 출력
        System.out.println("교과목명\t최대 학생수\t현재 학생수");
        System.out.println(algorithmCourse.getCourseInfo());
        System.out.println(dataStructureCourse.getCourseInfo());

        // 생성된 교과목 수 출력
        System.out.println("\n생성된 교과목들의 수: " + Course.getTotalCourseCount());

        // 학생 생성
        Student student1 = new Student("2101", "선남", 18);
        Student student2 = new Student("2102", "선녀", 21);
        Student student3 = new Student("2103", "길동", 18);

        System.out.println("\n학번\t\t이름\t\t신청 학점수");

        // 학생 정보 출력
        System.out.println(student1.getStudentInfo());
        System.out.println(student2.getStudentInfo());
        System.out.println(student3.getStudentInfo()+ "\n");

        // Register 객체 정보 출력
        Register register1 = new Register(student1, algorithmCourse);
        Register register2 = new Register(student2, algorithmCourse);
        Register register3 = new Register(student2, dataStructureCourse);
        Register register4 = new Register(student3, algorithmCourse);
        Register register5 = new Register(student3, dataStructureCourse);

        System.out.println(register1.getRegistrationInfo());
        System.out.println(register2.getRegistrationInfo());
        System.out.println(register3.getRegistrationInfo());
        System.out.println(register4.getRegistrationInfo());
        System.out.println(register5.getRegistrationInfo());

        // 수강 신청
        System.out.println("\n수강 신청후\n");

        // 교과목 정보 출력
        System.out.println("교과목명\t최대 학생수\t현재 학생수");
        System.out.println(algorithmCourse.getCourseInfo());
        System.out.println(dataStructureCourse.getCourseInfo());

        // 학생 정보 출력
        System.out.println("\n학번\t\t이름\t\t학점수");
        System.out.println(student1.getStudentInfo());
        System.out.println(student2.getStudentInfo());
        System.out.println(student3.getStudentInfo());

    }
}

