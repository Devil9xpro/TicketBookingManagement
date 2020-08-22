package com.devil9xpro.TicketBookingManagement.controller;

import com.devil9xpro.TicketBookingManagement.entities.Ticket;
import com.devil9xpro.TicketBookingManagement.service.TicketBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api/tickets")
public class TicketBookingController {
    @Autowired // declare that TicketBookingController depend on TicketBookingService
    private TicketBookingService ticketBookingService;

    @PostMapping(value = "/createTicket")
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketBookingService.createTicket(ticket);
    }

    @GetMapping(value = "/ticket/{ticketId}")
    public Optional<Ticket> getTicketByID(@PathVariable("ticketId") int ticketId) {
        return ticketBookingService.getTicketByID(ticketId);
    }

    @GetMapping(value = "/ticket/alltickets")
    public Iterable<Ticket> getAllBookedTickets() {
        return ticketBookingService.getAllBookedTickets();
    }

    @DeleteMapping(value = "/ticket/{ticketId}")
    public void delelteTicket(@PathVariable("ticketId") int ticketId) {
        ticketBookingService.delelteTicket(ticketId);
    }

    @PutMapping(value = "/ticket/{ticketId}/{newEmail:.+}")
    public Ticket updateTicket(@PathVariable("ticketId") int ticketId, @PathVariable("newEmail") String newEmail){
        return ticketBookingService.updateTicket(ticketId,newEmail);
    }


}
