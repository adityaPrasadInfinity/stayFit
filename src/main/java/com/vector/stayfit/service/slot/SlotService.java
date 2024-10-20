package com.vector.stayfit.service.slot;

import com.vector.stayfit.entity.Slot;
import java.util.List;

public interface SlotService {

  List<Slot> getSlotByGymCentreId(Long gymId);

  Slot addSlot(Slot slot);
}
