package org.sl.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumeController {

    private final String URL_PREFIX = "http://UPLOAD-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value="consumer/upload")
    public String upload() {
        return restTemplate
                    .getForObject(URL_PREFIX+"/upload", String.class);
    }
}
