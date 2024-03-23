package com.juslen.form.controller;

import jakarta.security.auth.message.callback.SecretKeyCallback;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Slf4j
public class SubmitFormController {

    @RequestMapping(path = "/submit", method = RequestMethod.POST)
    public String contactFormSubmission(){
        return "redirect:success.html";
    }
}
