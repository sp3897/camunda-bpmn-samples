package com.puranam.bpmn;


import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableProcessApplication // do not needed it as we want to load our bpmn files!!
// https://forum.camunda.org/t/spring-boot-application-autodeployment-doesnt-work/4221/3
public class Application {
    public static void main(final String[] args) throws Exception{
        SpringApplication.run(Application.class, args);
    }
}

