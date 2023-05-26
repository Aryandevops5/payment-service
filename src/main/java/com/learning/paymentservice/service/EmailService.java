package com.learning.paymentservice.service;

import com.learning.paymentservice.entity.EmailDetails;
import org.springframework.stereotype.Component;

@Component
public interface EmailService {
    String sendSimpleMail(EmailDetails details);

    // Method
    // To send an email with attachment
    String sendMailWithAttachment(EmailDetails details);
}
