package com.devil9xpro.TicketBookingManagement;

import com.devil9xpro.TicketBookingManagement.entities.Ticket;
import com.devil9xpro.TicketBookingManagement.service.TicketBookingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Date;

@SpringBootApplication
public class TicketBookingManagementApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(TicketBookingManagementApplication.class, args);
        TicketBookingService ticketBookingService =
                applicationContext.getBean("ticketBookingService", TicketBookingService.class);//name of service can Be Ticket -> ticket
        Ticket ticket = new Ticket();
        ticket.setBookingDate(new Date());
        ticket.setDestStation("USA");
        ticket.setSourceStation("Viet Nam");
        ticket.setPassengerName("Chinh");
        ticket.setEmail("chinhzz3107@gmail.com");
        ticketBookingService.createTicket(ticket);


    }

}
