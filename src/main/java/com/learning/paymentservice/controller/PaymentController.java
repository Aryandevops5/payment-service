package com.learning.paymentservice.controller;

import com.learning.paymentservice.documents.PaymentDocument;
import com.learning.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping
    public PaymentDocument create(@RequestBody PaymentDocument paymentDocument) {
        return paymentService.save(paymentDocument);
    }

    @GetMapping("/{id}")
    public PaymentDocument findPayment(@PathVariable(value = "id") Long id) {
        try {
            return paymentService.find(id);
        } catch (Exception e) {
            return PaymentDocument.builder()
                    .price(-1.0)
                    .build();
        }
    }
}
