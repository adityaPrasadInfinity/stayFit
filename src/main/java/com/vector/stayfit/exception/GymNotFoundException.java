package com.vector.stayfit.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class GymNotFoundException extends RuntimeException{

  private String message;

}
