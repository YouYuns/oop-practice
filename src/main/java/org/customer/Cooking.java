package org.customer;

public class Cooking {
    public Cook makeCook(MenuItem menuItem) {
        return new Cook(menuItem);
    }
}
