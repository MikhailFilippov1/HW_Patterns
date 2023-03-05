package HW5;

import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "mark")
    String mark;

    public Student(String name, String mark) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name +
                ", mark='" + mark +
                '}';
    }
}
