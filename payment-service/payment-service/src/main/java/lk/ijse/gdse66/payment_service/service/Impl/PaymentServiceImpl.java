package lk.ijse.gdse66.payment_service.service.Impl;

import lk.ijse.gdse66.payment_service.dto.PaymentDTO;
import lk.ijse.gdse66.payment_service.entity.Payment;
import lk.ijse.gdse66.payment_service.repository.PaymentRepo;
import lk.ijse.gdse66.payment_service.service.PaymentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private RestTemplate template;

    @Override
    public PaymentDTO savePayment(PaymentDTO paymentDTO) {
        if (repo.existsById(paymentDTO.getId())){
            new RuntimeException("all ready Exits");
        }
        try {
            PaymentDTO dto = template.getForObject("http://localhost:8080/ticket/" + paymentDTO.getTicketId(), PaymentDTO.class);
            if (dto != null) {
                return mapper.map(repo.save(mapper.map(paymentDTO, Payment.class)), PaymentDTO.class);
            } else {
                throw new RuntimeException("ID does not match: " + paymentDTO.getTicketId());
            }
        } catch (HttpClientErrorException e) {
            throw new RuntimeException("Error fetching user: " + e.getMessage());
        }
    }

    @Override
    public PaymentDTO updatePayment(PaymentDTO paymentDTO) {
        if (!repo.existsById(paymentDTO.getId())){
            new RuntimeException("all ready Exits");
        }
        return mapper.map(repo.save(mapper.map(paymentDTO, Payment.class)), PaymentDTO.class);

    }

    @Override
    public List<PaymentDTO> getAllPayment() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<PaymentDTO>>() {
        }.getType());
    }
}
