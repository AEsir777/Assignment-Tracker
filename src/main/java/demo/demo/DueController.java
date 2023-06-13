package demo.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// shorthand to include both @Controller and @ResponseBody
@RestController
public class DueController {
    private static final String template = "Course: %s, Due Date: %s";
    private final AtomicLong id = new AtomicLong();

    @GetMapping("/cmd")
    public Due due(@RequestParam(value = "course", defaultValue = "null") String course,
    @RequestParam(value = "dueDate", defaultValue = "null") String dueDate) {
        return new Due(id.incrementAndGet(), course, dueDate);
    }
}
