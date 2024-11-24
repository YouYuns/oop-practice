package org.customer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;


public class CustomerTest {
    @DisplayName("메뉴이름에 해당하는 요리를 주문한다")
    @Test
    void orderTest() {
        Customer customer = new Customer();
        Menu  menu = new Menu(List.of(new MenuItem("돈까스", 5000), new MenuItem("냉면", 7000)));
        Cooking cooking = new Cooking();

        //고객이 만두를 주문하고 메뉴항목을 전달하고 요리사의 정보를 전달한다.
        assertThatCode(() -> customer.order("돈까스", menu, cooking))
                .doesNotThrowAnyException();
    }
}
