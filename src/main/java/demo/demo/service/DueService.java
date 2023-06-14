package demo.demo.service;

import java.util.List;
import demo.demo.entity.Due;

public interface DueService {
    List<Due> getAllDues();

    Due saveDue(Due due);

    Due getDueById(Long id);
    Due updateDue(Due due);

    void deleteDueById(Long id);
}
