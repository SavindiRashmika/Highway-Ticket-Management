package lk.ijse.gdse66.ticket_service.service;

import lk.ijse.gdse66.ticket_service.dto.TicketDTO;

import java.util.List;

public interface TicketService {

    TicketDTO saveTicket(TicketDTO ticketDTO);
    TicketDTO updateTicket(TicketDTO ticketDTO);
    List<TicketDTO> getAllTicket();
    void deleteTicket(String id);
}
