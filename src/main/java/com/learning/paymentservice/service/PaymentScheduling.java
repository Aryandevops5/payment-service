package com.learning.paymentservice.service;

import com.learning.paymentservice.documents.PaymentDocument;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class PaymentScheduling {

    @Autowired
    private PaymentService paymentService;
    @Scheduled(cron = "0 28 12 30  * *")
    public void scheduleTask()
    {
        log.info("I am started - jo karna hai  karwa le mujhse ");
      List<PaymentDocument>  paymentDocumentsList = paymentService.findAllPayments();
      if (paymentDocumentsList != null && !paymentDocumentsList.isEmpty()){
          paymentDocumentsList.stream().forEach(payment -> log.info("payment {}",payment));
      }
    }
}
