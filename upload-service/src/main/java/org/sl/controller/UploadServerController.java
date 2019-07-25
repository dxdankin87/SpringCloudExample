package org.sl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadServerController {

    @GetMapping(value = "/upload")
    public String upload() {
        System.out.println("upload");
        return "success";
    }
}
