package demo.demo.dependency_injection;

import org.springframework.stereotype.Component;

@Component
public class Order {
    private int Order;

    public void print() {
        System.out.println("order");
    }
}
