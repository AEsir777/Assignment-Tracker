package demo.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Dues")
public class Due {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // if not add column/table => use field/class name
    @Column(name = "course", nullable = false)
    private String course;
    
    @Column(name = "dueDate")
    private String dueDate;

    @Column(name = "completed")
    private boolean completed;

    public Due() {}

    public Due(String course, String dueDate, boolean completed) {
        super();
        this.course = course;
        this.dueDate = dueDate;
        this.completed = completed;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public String getDueDate() {
        return dueDate;
    }
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
