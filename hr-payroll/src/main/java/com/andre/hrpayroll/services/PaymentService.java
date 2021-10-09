package com.andre.hrpayroll.services;

import com.andre.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public Payment getPayments(long workerId, int days) {
        return new Payment("Bob", 200.0, days);
    }
}
