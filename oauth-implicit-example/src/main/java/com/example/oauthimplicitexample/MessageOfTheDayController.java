package com.example.oauthimplicitexample;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageOfTheDayController {
   @GetMapping("/mod")
   public String getMessageOfTheDay(Principal principal) {
       return "The message of the day is boring for user: " + principal.getName();
   }
}