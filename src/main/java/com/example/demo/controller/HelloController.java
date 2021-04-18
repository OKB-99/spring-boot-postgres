package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

  @RequestMapping("/")
  public String getHelp() {
    log.info("getHelp() called.");
    return "Call me through the links: e.g. localhost:8080/rna/1234 or localhost:8080/rna/upi/URS00000004D2";
  }

  @RequestMapping("/hello")
  public String index() {
    log.info("index() called.");
    return "Greetings from Spring Boot!";
  }
}
