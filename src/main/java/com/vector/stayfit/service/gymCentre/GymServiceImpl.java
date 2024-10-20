package com.vector.stayfit.service.gymCentre;

import com.vector.stayfit.entity.GymCenter;
import com.vector.stayfit.exception.GymNotFoundException;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class GymServiceImpl implements GymService{

  private List<GymCenter> gymCenterList;

  @PostConstruct
  void init(){
    gymCenterList = new ArrayList<>();
  }

  @Override
  public GymCenter getGymCentreById1(Long gymId) {
    List<GymCenter> gyms = gymCenterList.stream().filter(e->e.getId().equals(gymId)).toList();

    if(gyms.isEmpty()){
      throw new GymNotFoundException("gym not found");
    }

    return gyms.get(0);
  }

  @Override
  public GymCenter addGymCentre(GymCenter gymCenter) {
    gymCenter.setId(Long.valueOf(gymCenterList.size()));
    gymCenterList.add(gymCenter);
    return gymCenter;
  }
}
