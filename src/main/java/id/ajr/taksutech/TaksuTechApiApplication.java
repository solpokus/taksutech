package id.ajr.taksutech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TaksuTechApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaksuTechApiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		builder.setConnectTimeout(10000);
		builder.setReadTimeout(5000);
		return builder.build();
	}
}
