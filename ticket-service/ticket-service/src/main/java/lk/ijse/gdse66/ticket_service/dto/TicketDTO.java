package lk.ijse.gdse66.ticket_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {

    private String id;
    private String entrance;
    private String exits;
    private double price;
    private String userId;
    private String vehicleId;
}
