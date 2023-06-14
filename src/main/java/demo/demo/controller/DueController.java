package demo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import demo.demo.service.DueService;
import demo.demo.entity.Due;
import demo.demo.repository.DueRepository;

@Controller
public class DueController {
    private DueService dueService;

    public DueController(DueService dueService) {
        super();
        this.dueService = dueService;
    }
    
    // handler method to handle list students and return mode and view
    @GetMapping("/dues")
    public String listDues(Model model) {
        model.addAttribute("dues", dueService.getAllDues());
        return "dues"; // view
    }

    @PostMapping("/dues")
    public String saveDue(@ModelAttribute("due") Due due) {
        dueService.saveDue(due);
        return "redirect:/dues";
    }

    @GetMapping("/dues/new")
    public String createDueForm(Model model) {
        // create due object
        Due due = new Due();
        model.addAttribute("due", due);
        return "createDue";
    }

    @GetMapping("/dues/update/{id}")
    public String editDueForm(@PathVariable Long id, Model model) {
        model.addAttribute("due", dueService.getDueById(id));
        return "updateDue";
    }
    
    @PostMapping("/dues/{id}")
    public String updateDue(@PathVariable Long id, @ModelAttribute("due") Due due) {
        Due curDue = dueService.getDueById(id);
        // need id?
        curDue.setCourse(due.getCourse());
        curDue.setDueDate(due.getDueDate());

        dueService.updateDue(curDue);
        return "redirect:/dues";
    }

    @GetMapping("/dues/delete/{id}")
    public String deleteDue(@PathVariable Long id) {
        dueService.deleteDueById(id);
        return "redirect:/dues";
    }
}
