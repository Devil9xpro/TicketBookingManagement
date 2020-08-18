package com.devil9xpro.TicketBookingManagement.service;

import com.devil9xpro.TicketBookingManagement.dao.TicketBookingDAO;
import com.devil9xpro.TicketBookingManagement.entities.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketBookingService {
    @Autowired
    private TicketBookingDAO ticketBookingDAO;

    public Optional<Ticket> getTicketByID(int ticketId) {
        return ticketBookingDAO.findById(ticketId);
    }

    public Ticket createTicket(Ticket ticket) {
        return ticketBookingDAO.save(ticket);
    }

    public Iterable<Ticket> getAllBookedTickets() {
        return ticketBookingDAO.findAll();
    }

    public void delelteTicket(int ticketId) {
        ticketBookingDAO.deleteById(ticketId);
    }

    public Ticket updateTicket(int ticketId, String newEmail) {
        Ticket ticketFromDb = ticketBookingDAO.findById(ticketId).orElse(null);
        assert ticketFromDb != null;
        ticketFromDb.setEmail(newEmail);
        Ticket updatedTicket = ticketBookingDAO.save(ticketFromDb);
        return  updatedTicket;
    }
}


