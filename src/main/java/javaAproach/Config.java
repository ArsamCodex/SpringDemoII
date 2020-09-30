package javaAproach;

import javaAproach.data.EmployeeRepository;
import javaAproach.data.EmployeeRepositoryImpl;
import javaAproach.service.EmployeeService;
import javaAproach.service.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Configuration
public class Config {
    @Bean
    public EmployeeService createEmployeeService() {
        return new EmployeeServiceImpl(createEmployeeRepository());
    }

    @Bean
    public EmployeeRepository createEmployeeRepository() {
        return new EmployeeRepositoryImpl(createEMF());
    }

    @Bean
    public EntityManagerFactory createEMF() {
        return Persistence.createEntityManagerFactory("dataSource");

    }


}
