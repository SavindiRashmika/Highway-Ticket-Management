package lk.ijse.gdse66.payment_service.controller;

import lk.ijse.gdse66.payment_service.dto.PaymentDTO;
import lk.ijse.gdse66.payment_service.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @GetMapping
    public List<PaymentDTO> getAllPayment(){
        return service.getAllPayment();
    }

    @PostMapping
    public PaymentDTO savePayment(@RequestBody PaymentDTO dto){
        System.out.println("savePayment");
        return service.savePayment(dto);
    }

    @PutMapping
    public PaymentDTO updatePayment(@RequestBody PaymentDTO dto){
        System.out.println("updatePayment");
        return service.updatePayment(dto);
    }

}
