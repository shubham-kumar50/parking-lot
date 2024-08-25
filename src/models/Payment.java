package models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Payment {
    private double amount;
    private String transactionId;
    private Date time;
    private Ticket ticket;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
}
