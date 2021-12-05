package com.careerdevs.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class GithubusersApplication {
	@GetMapping("/API/users")
	public GithubuserAPI[] url(RestTemplate restTemplate) {
		String url = "https://api.github.com/users";
		GithubuserAPI[] name = restTemplate.getForObject(url, GithubuserAPI[].class);

		return name;
	}
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubusersApplication.class, args);
	}

}
