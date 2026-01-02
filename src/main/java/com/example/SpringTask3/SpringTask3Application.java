package com.example.SpringTask3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   //This is combination of
                        // @Configuration : use to define beans
                        // @ComponentScan : scan package and check components(@Component,@Service,@Repository,@Controller etc)
                        // @EnableAutoConfiguration : automatically configure dependency ,classpath , properties
public class SpringTask3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringTask3Application.class, args);
	}

}
