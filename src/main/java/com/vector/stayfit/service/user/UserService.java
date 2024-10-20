package com.vector.stayfit.service.user;

import com.vector.stayfit.entity.User;

public interface UserService {

  User getUserById(Long userId);

  User createUser(User user);
}
