package com.juslen.form.controller;

import com.juslen.form.domain.ContactForm;
import jakarta.security.auth.message.callback.SecretKeyCallback;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Slf4j
public class SubmitFormController {

    @RequestMapping(path = "/submit", method = RequestMethod.POST)
    public String contactFormSubmission(@Valid @ModelAttribute final ContactForm contactform){
        System.out.println(contactform.toString());
        return "redirect:success.html";
    }
}
