package org.gradeCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 *  요구사항
 * • 평균학점 계산 방법 = (학점수×교과목 평점)의 합계/수강신청 총학점 수
 * • 일급 컬렉션 사용
 */
public class GradeCalculatorTest {
    // 학점계산기 도메인 : 이수한 과목, 학점 계산기
    // 객체지향프로그래밍, 자료구조, 중국어회화 ---> 과목(코스) 클래스


    /**
     * 핵심 포인트
     */
    //이수한과목을 전달하여 평균학점 계산 요청 ---> 학점 계산기 (학점수×교과목 평점)의 합계 ---> 과목(코스)
    //                                   ---> 수강신청 총학점 수                   ---> 과목(코스)

    @DisplayName("평균 학점을 계산한다.")
    @Test
    void calculateGradeTest() {
        //리스트로 변환시키는게 Arrays.asList(array)를 사용하는데 Java9 부텅 List.of(Array)를 사용가능하다.
        //Arrays.asList()는 크고 동적인 데이터에 사용하고, List.of()는 작고 변경되지 않는 데이터의 경우 사용합니다.
        //List.of()는 필드 기반 구현이 있고, 비교적 힙 공간을 덜 사용하기에 요소 자체가 필요하다면 List.of()가 적절합니다.
        //Arrays.asList()는 변경이 가능하기 때문에 thread safety 하지 않고, List.of()는 불변객체이므로 thread safety합니다.
        //Arrays.asList()는 null 요소를 허용하고 List.of()는 null 요소를 허용하지 않습니다.
        //Arrays.asList(), List.of() 모두 크기는 변경할 수 없습니다. 크기를 바꾸려면 Collections을 생성해서 요소의 값을 옮겨야 합니다.
        List<Course> courses = List.of(new Course("OOP", 3, "A+"), new Course("자료구조", 3, "A+"));

        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double gradeResult = gradeCalculator.calculateGrade();

        assertThat(gradeResult).isEqualTo(4.5);
    }
}
