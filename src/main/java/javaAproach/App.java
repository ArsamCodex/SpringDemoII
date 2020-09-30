package javaAproach;

import javaAproach.data.EmployeeRepository;
import javaAproach.service.EmployeeService;
import javaAproach.service.EmployeeServiceImpl;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main ( String [] args) throws InterruptedException {
        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);


        EmployeeService service = context.getBean(EmployeeService.class);

        System.out.println(service.getClass());
    }
}
