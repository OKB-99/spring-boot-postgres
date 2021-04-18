package com.example.demo.repository;

import com.example.demo.model.Rna;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RnaRepository extends CrudRepository<Rna, Integer> {

  List<Rna> findByUpi(String upi);

  Optional<Rna> findById(Integer id);
}
