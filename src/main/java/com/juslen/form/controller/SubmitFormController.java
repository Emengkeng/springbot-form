package com.juslen.form.controller;

import jakarta.security.auth.message.callback.SecretKeyCallback;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SubmitFormController {

    @RequestMapping(path = "/submit", method = RequestMethod.POST)
    public String contactFormSubmission(@RequestBody MultiValueMap values){
        System.out.println(values.toString());
        //return "";
        return "redirect:success.html";
    }
}
