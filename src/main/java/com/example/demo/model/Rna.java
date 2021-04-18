package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class Rna {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Integer id;
  private String upi;
  private Date timestamp;
  private String userstamp;
  private String crc64;
  private Integer len;
  private String seqShort;
  private String seqLong;
  private String md5 ;
}
