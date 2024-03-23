package com.juslen.form.controller;

import com.juslen.form.domain.ContactForm;
import jakarta.security.auth.message.callback.SecretKeyCallback;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping(path = "/submit")
public class SubmitFormController {
    private final SubmitFormService submitFormService;

   @PostMapping
    public String contactFormSubmission(@Valid @ModelAttribute final ContactForm contactform){
        System.out.println(contactform.toString());
        submitFormService.register(contactform);
        return "forward:/static/success.html";
    }
}
