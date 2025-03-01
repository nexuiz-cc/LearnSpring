package test;
import domain.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestMain {
    public static void main(String[] args){
        BeanFactory factory = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //2.帮我们创建对象 跟工厂要一个对象
        Student student = (Student)factory.getBean("student");
        System.out.println(student);
    }
}
