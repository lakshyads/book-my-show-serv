package com.lakshya.BookMyShowServ.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity(name = "user_table")
public class User extends BaseModel{
    private String name;
    private String email;
    private int phone;
    private LocalDate dob;
    @OneToMany
    private List<Booking> bookings;
}
