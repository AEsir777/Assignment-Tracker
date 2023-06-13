package demo.demo.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Customers {
    private int custid;
    private String custname;
    private String coursename;
    // know the existence of Order object
    @Autowired
    private Order order;

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public void display() {
        System.out.println("Customers object returned succsfully");
        order.print();
    }
}
