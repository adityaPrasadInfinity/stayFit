package com.vector.stayfit.service.user;

import com.vector.stayfit.entity.User;
import com.vector.stayfit.exception.UserNotFoundException;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  UserService{

  private List<User> userList;

  @PostConstruct
  void init(){
    userList = new ArrayList<>();
  }


  @Override
  public User getUserById(Long userId) {
    List<User> users = userList.stream().filter(e->e.getId().equals(userId)).toList();
    if(users.isEmpty()){
      throw new UserNotFoundException("user not found");
    }
    return users.get(0);
  }

  @Override
  public User createUser(User user) {
    user.setId(Long.valueOf(userList.size()));
    userList.add(user);
    return user;
  }
}
