package demo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoursesController {
    @RequestMapping("/courses")
    public void courses() {
        System.out.println("Welcome to edureka");
    }
}
