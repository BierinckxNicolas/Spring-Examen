package edu.ap.spring.controller;

import edu.ap.spring.jpa.Joke;
import edu.ap.spring.jpa.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@Controller
@Scope("session")
public class JokeController {

    @Autowired
    PersonRepository personRepository;

    private  String url = "http://api.icndb.com/jokes/random";

   
   public JokeController() {
   }


       
   @RequestMapping("/joke")
   public String joke() {
	   return "joke";
   }
		   
   @RequestMapping("/joke_post")
   public String joke_post() {

       RestTemplate restTemplate = new RestTemplate();
       Joke joke = restTemplate.getForObject(url, Joke.class);
       System.out.println(joke.toString());

	  return "joke_post";
   }

   
   @RequestMapping("/")
   public String root() {
	   return "redirect:/joke";
   }





}




