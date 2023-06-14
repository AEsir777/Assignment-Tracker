package demo.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import demo.demo.entity.Due;
import demo.demo.repository.DueRepository;
import demo.demo.service.DueService;

@Service
public class DueServiceImpl implements DueService {
    private DueRepository dueRepository;

    // one constructor can avoid autowired
    public DueServiceImpl(DueRepository dueRepository) {
        super();
        this.dueRepository = dueRepository;
    }

    @Override
    public List<Due> getAllDues() {
        return dueRepository.findAll();
    }

    @Override
    public Due saveDue(Due due) {
        return dueRepository.save(due);
    }

    @Override
    public Due getDueById(Long id) {
        return dueRepository.findById(id).get();
    }

    @Override
    public Due updateDue(Due due) {
        return dueRepository.save(due);
    }

    @Override
    public void deleteDueById(Long id) {
        dueRepository.deleteById(id);
    }

    
    
}
