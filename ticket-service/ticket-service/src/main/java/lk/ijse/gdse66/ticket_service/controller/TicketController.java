package lk.ijse.gdse66.ticket_service.controller;

import lk.ijse.gdse66.ticket_service.dto.TicketDTO;
import lk.ijse.gdse66.ticket_service.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketService service;

    @GetMapping
    public List<TicketDTO> getAllTicket(){
        return service.getAllTicket();
    }

    @PostMapping
    public TicketDTO saveTicket(@RequestBody TicketDTO dto){
        System.out.println("saveTicket");
        return service.saveTicket(dto);
    }

    @PutMapping
    public TicketDTO updateTicket(@RequestBody TicketDTO dto){
        System.out.println("updateTicket");
        return service.updateTicket(dto);
    }

    @DeleteMapping
    public void deleteTicket(String id){
        System.out.println("deleteTicket");
        service.deleteTicket(id);
    }
}
