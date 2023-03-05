package HW5;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentDaoUtils implements StudentDao {

    private SessionFactoryUtils sessionFactoryUtils;

    @Autowired
    public StudentDaoUtils(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }

    @Override
    public Student findById(Long id) {
        try(Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            session.getTransaction().commit();
            return student;
        }
    }

    @Override
    public List<Student> findAll() {
        try(Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            List<Student> students = session.createQuery("select s from Student s").getResultList();
            session.getTransaction().commit();
            return students;
        }
    }

    @Override
    public Student findByName(String name) {
        try(Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            Student student = session.createQuery("select s from Student s where s.name = :name", Student.class).setParameter("name", name).getSingleResult();
            session.getTransaction().commit();
            return student;
        }
    }

    @Override
    public void save(Student student) {
        try(Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            session.saveOrUpdate(student);
            session.getTransaction().commit();
        }
    }

    @Override
    public void update(Long id, String name) {
        try(Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            student.setName(name);
            session.getTransaction().commit();
        }
    }

    @Override
    public void deleteById(Long id) {
        try(Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            session.delete(student);
            session.getTransaction().commit();
        }
    }


    @Override
    public void saveOrUpdate(Student student) {
        try(Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            session.saveOrUpdate(student);
            session.getTransaction().commit();
        }
    }
}
