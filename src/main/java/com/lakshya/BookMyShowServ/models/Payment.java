package com.lakshya.BookMyShowServ.models;

import com.lakshya.BookMyShowServ.models.constants.PaymentMethod;
import com.lakshya.BookMyShowServ.models.constants.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private double amount;
    private LocalDateTime paymentTime;
    private String referenceId;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    @ManyToOne
    private Booking booking;
    @OneToMany
    private List<Transaction> transactions;
}
