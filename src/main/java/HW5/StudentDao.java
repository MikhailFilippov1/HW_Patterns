package HW5;

import java.util.List;

public interface StudentDao {

        Student findById(Long id);

        List<Student> findAll();

        Student findByName(String name);

        void save(Student student);

        void update(Long id, String name);

        void deleteById(Long id);

        void saveOrUpdate(Student student);
}
