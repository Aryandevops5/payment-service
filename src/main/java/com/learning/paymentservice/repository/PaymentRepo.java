package com.learning.paymentservice.repository;

import com.learning.paymentservice.documents.PaymentDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepo extends MongoRepository<PaymentDocument, Long> {
}
