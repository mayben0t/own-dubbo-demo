import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.SayHelloService;

public class Handler {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext bf = new ClassPathXmlApplicationContext("beans.xml");
        bf.start();
        System.in.read();

    }
}
