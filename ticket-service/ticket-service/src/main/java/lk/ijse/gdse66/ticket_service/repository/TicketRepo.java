package lk.ijse.gdse66.ticket_service.repository;

import lk.ijse.gdse66.ticket_service.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<Ticket, String> {
}
