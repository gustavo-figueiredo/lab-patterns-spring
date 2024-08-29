package lab.patterns.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabPatternsSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPatternsSpringApplication.class, args);
	}

}
