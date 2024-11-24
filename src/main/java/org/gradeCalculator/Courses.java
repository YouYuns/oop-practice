package org.gradeCalculator;

import java.util.List;

public class Courses {
   private final List<Course> courses;


    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {

        //(학점수 * 교과목 평점)의 합계
//        double multipliedCreditAndCourseGrade = 0;
//        for(Course course : courses) {
//            //A+ , B+ 등 문자로 받은 교과목 평점을 숫자로 변환하는 메서드
//            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
//        }
//        return multipliedCreditAndCourseGrade;


        //위에 코드를 더 간단히 표현가능
        return courses.stream().mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();

    }

    public int calculateTotalCompletedCredit() {
       return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
