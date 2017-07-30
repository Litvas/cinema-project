package com.asdevelopment.service;

import com.asdevelopment.entity.Seat;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HallService {

    List<Seat> showAvailableSeat(String hallname);

    String statusOHall(String hallname);

}
