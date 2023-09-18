package oneWeek;

public class Driver2 {
    public static void main(String[] args) {
        Course algo = new Course("알고리즘" , 30 , 4);
        Course datastruc = new Course("자료 구조" , 25 ,3);

        System.out.println("수강 신청전"+"\n");
        System.out.println("교과목명   최대 학생수     현재 학생수");

        System.out.println(algo);
        System.out.println(datastruc);
        algo.setMax(6);
        datastruc.setMax(3);
        System.out.println("\n"+"수강 인원 증원후"+"\n");
        System.out.println("교과목명   최대 학생수     현재 학생수");

        System.out.println(algo);
        System.out.println(datastruc);
        System.out.println("\n"+"생성된 교과목들의 수: "+datastruc.getCount()+"\n");

        Student st1 = new Student("2101", "선남", 18);
        Student st2 = new Student("2102", "선녀", 21);
        Student st3 = new Student("2103", "길동", 18);

        System.out.println("학번\t\t이름\t\t신청 학점수");
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

        Register rg1 = new Register(algo, st1);
        rg1.doCourseRegister(st1 , algo);
        Register rg2 = new Register(algo, st2);
        rg2.doCourseRegister(st2,algo);
        Register rg3 = new Register(datastruc, st2);
        rg3.doCourseRegister(st2,datastruc);
        Register rg4 = new Register(algo, st3);
        rg4.doCourseRegister(st3,algo);
        Register rg5 = new Register(datastruc, st3);
        rg5.doCourseRegister(st3,datastruc);

        System.out.println(rg1);
        System.out.println(rg2);
        System.out.println(rg3);
        System.out.println(rg4);
        System.out.println(rg5);

        System.out.println("\n수강 신청후\n");
        System.out.println("교과목명   최대 학생수     현재 학생수");
        System.out.println(algo);
        System.out.println(datastruc);

        System.out.println("\n학번\t이름\t학점수");
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}
