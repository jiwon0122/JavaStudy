package oneWeek;

public class Student {
    private String number;   //학번
    private String name;     //이름
    private int max;        //최대 신청 학점수
    private int score;      //신청 학점수

    public Student(String number, String name, int max) {
        this.number = number;
        this.name = name;
        this.max = max;
        this.score = 0;
    }

    @Override
    public String toString() {
        return number+"\t"+ name+"\t\t" + score;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

