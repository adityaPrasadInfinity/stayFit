package com.vector.stayfit.constants.userRole;

public enum UserRole {

  ADMIN(1), CUSTOMER(2);

  private Integer role;

  UserRole(Integer role){
    this.role = role;
  }

  public Integer getRole() {
    return role;
  }

  public void setRole(Integer role) {
    this.role = role;
  }
}