package com.devil9xpro.TicketBookingManagement.dao;

import com.devil9xpro.TicketBookingManagement.entities.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketBookingDAO extends CrudRepository<Ticket, Integer> {//Integer: Type of primary key

}
