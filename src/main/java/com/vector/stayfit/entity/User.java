package com.vector.stayfit.entity;

import com.vector.stayfit.constants.userRole.UserRole;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private Long id;

  private String name;

  private String address;

  private UserRole role;

  private boolean isActive;

  private Date created;
}
