package com.example.demo.controller;

import com.example.demo.model.Rna;
import com.example.demo.service.RnaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class RnaController {

  @Autowired
  RnaService rnaService;

  @GetMapping("/rna/{id}")
  public Rna findById(@PathVariable Integer id) {
    log.info("findById with id = " + id.toString());
    return rnaService.findById(id);
  }

  @GetMapping("/rna/search")
  public List<Rna> findByUpi(@RequestParam String upi) {
    log.info("findByUpi with upi = " + upi);
    return rnaService.findByUpi(upi);
  }
}
