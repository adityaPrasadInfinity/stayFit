package com.vector.stayfit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GymCenter {

  private Long id;

  private String name;

  private String address;

  private Long slotsAvailable;

}
