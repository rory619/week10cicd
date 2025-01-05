package ie.atu.week10cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Week10cicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week10cicdApplication.class, args);
	}

}
