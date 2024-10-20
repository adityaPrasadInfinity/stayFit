package com.vector.stayfit.service.gymCentre;

import com.vector.stayfit.entity.GymCenter;
import java.util.List;

public interface GymService {

  GymCenter getGymCentreById1(Long gymId);

  GymCenter addGymCentre(GymCenter gymCenter);
}
