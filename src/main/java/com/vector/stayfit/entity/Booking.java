package com.vector.stayfit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Booking {

  private Long id;

  private Long userId;

  private Long gymCenterId;

  private Long slotId;
}
