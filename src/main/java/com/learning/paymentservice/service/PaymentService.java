package com.learning.paymentservice.service;

import com.learning.paymentservice.documents.PaymentDocument;
import com.learning.paymentservice.repository.PaymentRepo;
import com.learning.paymentservice.utils.SequenceGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class  PaymentService {

    private final PaymentRepo paymentRepo;
    private final SequenceGenerator sequenceGenerator;

    public PaymentDocument save(PaymentDocument paymentDocument) {
       Long id = sequenceGenerator.getSequenceNumber(PaymentDocument.SEQUENCE_NAME);
       paymentDocument.setId(id);
       return paymentRepo.save(paymentDocument);
    }

    public PaymentDocument find(Long id) {
        return paymentRepo.findById(id).get();
    }

    public List<PaymentDocument> findAllPayments(){
        return paymentRepo.findAll();
    }


}
