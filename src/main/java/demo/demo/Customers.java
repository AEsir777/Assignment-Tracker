package demo.demo;

import org.springframework.stereotype.Component;


@Component
public class Customers {
    private int custid;
    private String custname;
    private String coursename;

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public void display() {
        System.out.println("Customers object returned succsfully");
    }
}
