package demo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import demo.demo.entity.Due;

// transactional added in JpaRepository
public interface DueRepository extends JpaRepository<Due, Long>{
    
}
