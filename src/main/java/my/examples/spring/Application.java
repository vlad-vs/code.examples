package my.examples.spring;


import my.examples.txtReader.ReaderMain;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("/configs/springConfig/app-context.xml");
        final ReaderMain bean = (ReaderMain) context.getBean("readerMain");
        bean.run();
    }
}