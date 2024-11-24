package org.gradeCalculator;

public class Course {

    private String subject;
    private int credit;
    private String grade;
    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;


    }

    public int getCredit() {
        return credit;
    }

    // 여기서 만드는이유는 이곳에서만 나중에 수정하면 계산하는 모든 부분을 수정할 필요가없다
    // 응집도가 낮기 떄문에 정보를 가져와서 처리하는방식으로하면 안되고 해당 객체에서 메세지를 던져서 작업을 처리하게 해주어야한다.
    public double multiplyCreditAndCourseGrade() {
        return credit * getGradeToNumber();
    }

    public double getGradeToNumber() {
        double gradeInt = 0;
        switch (this.grade) {
            case "A+":
                gradeInt = 4.5;
                break;
            case "A":
                gradeInt = 4.0;
                break;
            case "B+":
                gradeInt = 3.5;
                break;
            case "B":
                gradeInt = 3.0;
                break;
            case "C+":
                gradeInt = 2.5;
                break;
            case "C":
                gradeInt = 2.0;
                break;
            case "D+":
                gradeInt = 1.5;
                break;
            case "D":
                gradeInt = 1.0;
                break;
            case "F":
                gradeInt = 0.0;
                break;
        }

        return gradeInt;
    }

}
