package org.example;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

/**
 * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
 * 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생시킨다.
 * 경계조건에 대해 테스트 코드를 작성해야 한다.
 */
public class PasswordVaildateTest {

    @DisplayName("비밀번호가 최소 8자 이상 12자 이하면 예외가 발생하지 않는다")
    @Test
    void vaildatePasswordTest() {
        assertThatCode(()-> PasswordVaildator.vaildate("servershyun"))
                .doesNotThrowAnyException();
    }

    @DisplayName("비밀번호가 8자 미만 또는 12자 초과하는 경우 IllegalArgumentException이 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"aabbcce", "asdasdasdasda"})
    void vaildatePasswordTest2(String password) {
    //ParameterizedTest를 통해서 경계값을 테스트를 한다.
        //경계값 테스트는 필수고 7자거나 13자인 경우를 테스트를 해본다
        //테스트코드를 작성하는 이유는 코드에 결함을 발견은 기본이고 리팩토링 시 안정성을 확보할수 있다.

        assertThatCode(() -> PasswordVaildator.vaildate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Password length must be between 8 and 12");
    }
}
