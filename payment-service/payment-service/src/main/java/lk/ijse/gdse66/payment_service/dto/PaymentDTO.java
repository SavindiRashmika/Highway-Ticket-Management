package lk.ijse.gdse66.payment_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {

    private String id;
    private String ticketId;
    private double price;
    private String status;
}
