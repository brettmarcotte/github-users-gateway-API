package com.careerdevs.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
    @GetMapping("/API/users")
    public GithubuserAPI[] url(RestTemplate restTemplate) {
        String url = "https://api.github.com/users/mojombo";
        GithubuserAPI[] name = restTemplate.getForObject(url, GithubuserAPI[].class);

        return name;
    }

}
