package lk.ijse.gdse66.payment_service.service;

import lk.ijse.gdse66.payment_service.dto.PaymentDTO;

import java.util.List;

public interface PaymentService {

    PaymentDTO savePayment(PaymentDTO paymentDTO);
    PaymentDTO updatePayment(PaymentDTO paymentDTO);
    List<PaymentDTO> getAllPayment();
}
