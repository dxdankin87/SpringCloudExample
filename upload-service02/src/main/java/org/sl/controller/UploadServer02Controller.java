package org.sl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadServer02Controller {

    @PostMapping( value = "/upload" )
    public String upload() {
        System.out.println("upload02");
        return "success";
    }
}
