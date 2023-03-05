package HW5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("HW_Pattern_Observer")
public class HW5_hibernate {
    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        Student student = new Student("Mike", "Politics");

        try{
            StudentDao studentDao = new StudentDaoUtils(sessionFactoryUtils);
            System.out.println(studentDao.findAll());
            System.out.println(studentDao.findById(3L));
            studentDao.saveOrUpdate(student);
            System.out.println(studentDao.findAll());
            studentDao.deleteById(3L);
            System.out.println(studentDao.findAll());
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            sessionFactoryUtils.shutdown();
        }
    }
}
