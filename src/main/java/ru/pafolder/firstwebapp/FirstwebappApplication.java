package ru.pafolder.firstwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.pafolder.firstwebapp.controllers.SPController;

import java.io.IOException;

@SpringBootApplication
public class FirstwebappApplication {

	@Autowired
	public FirstwebappApplication(ApplicationContext context) {
		context.getBeanDefinitionNames();
		String[] beanNames = context.getBeanDefinitionNames();
		for (String beanName: beanNames)
		SPController.log.warn(beanName);
	}

	public static void main(String[] args) throws IOException {
		SpringApplication.run(FirstwebappApplication.class, args);

		Runtime rt = Runtime.getRuntime();
		String[] ss = {"C:\\Program Files\\Mozilla Firefox\\firefox.exe", "http://localhost:8080"};
		rt.exec(ss);
	}

}
