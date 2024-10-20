package com.vector.stayfit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Slot {

  private Long id;

  private Long gymCenterId;

  private String fromTime;

  private String toTime;

  private String day;

  }