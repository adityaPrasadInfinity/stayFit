package com.vector.stayfit.service.slot;

import com.vector.stayfit.entity.Slot;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SlotServiceImpl implements SlotService{

  List<Slot> slotList;

  @PostConstruct
  private void init(){
    slotList = new ArrayList<>();
  }

  @Override
  public List<Slot> getSlotByGymCentreId(Long gymId) {

    return slotList.stream().filter(e->e.getGymCenterId().equals(gymId)).toList();
  }

  @Override
  public Slot addSlot(Slot slot) {
    slot.setId(Long.valueOf(slotList.size()));
    slotList.add(slot);
    return slot;
  }
}
