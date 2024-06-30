package lk.ijse.gdse66.ticket_service.service.Impl;

import lk.ijse.gdse66.ticket_service.dto.TicketDTO;
import lk.ijse.gdse66.ticket_service.entity.Ticket;
import lk.ijse.gdse66.ticket_service.repository.TicketRepo;
import lk.ijse.gdse66.ticket_service.service.TicketService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public TicketDTO saveTicket(TicketDTO ticketDTO) {
        if (repo.existsById(ticketDTO.getId())){
            new RuntimeException("all ready Exits");
        }
        return mapper.map(repo.save(mapper.map(ticketDTO, Ticket.class)), TicketDTO.class);
    }

    @Override
    public TicketDTO updateTicket(TicketDTO ticketDTO) {
        if (repo.existsById(ticketDTO.getId())){
            new RuntimeException("all ready Exits");
        }
        return mapper.map(repo.save(mapper.map(ticketDTO, Ticket.class)), TicketDTO.class);

    }

    @Override
    public List<TicketDTO> getAllTicket() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<TicketDTO>>() {
        }.getType());
    }

    @Override
    public void deleteTicket(String id) {
        if (!repo.existsById(id)){
            new RuntimeException("all ready Exits");
        }
        repo.deleteById(id);
    }
}
