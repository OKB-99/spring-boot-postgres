package com.example.demo.service;

import com.example.demo.model.Rna;
import com.example.demo.repository.RnaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class RnaService {

  @Autowired
  private RnaRepository rnaRepository;

  public Rna findById(Integer id) {
    return rnaRepository.findById(id).orElse(null);
  }

  public List<Rna> findByUpi(String upi) {
    return rnaRepository.findByUpi(upi);
  }
}
