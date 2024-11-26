package org.customer;

//OOP 주문 프로그램
public class Customer {

    public void order(String menuName, Menu menu, Cooking cooking) {
    MenuItem menuItem = menu.choose(menuName);
    Cook cook = cooking.makeCook(menuItem);
    }
}
