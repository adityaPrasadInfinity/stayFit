package com.vector.stayfit.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserNotFoundException extends RuntimeException{

  private String message;
}
