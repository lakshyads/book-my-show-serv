package com.lakshya.BookMyShowServ.models;

import com.lakshya.BookMyShowServ.models.constants.BookingStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel {
    private LocalDateTime bookingTime;
    private Double totalAmount;
    @OneToMany
    private List<ShowSeat> showSeats;
    @ManyToOne
    private Show show;
    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

}
