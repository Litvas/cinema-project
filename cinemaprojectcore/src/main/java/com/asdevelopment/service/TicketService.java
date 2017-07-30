package com.asdevelopment.service;

import com.asdevelopment.entity.Seat;
import com.asdevelopment.entity.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TicketService {

   void sellTicket(Ticket ticket);

   List<Seat> showAvailableSeatByHall();

}
