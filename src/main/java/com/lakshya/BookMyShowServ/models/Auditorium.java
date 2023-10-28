package com.lakshya.BookMyShowServ.models;

import com.lakshya.BookMyShowServ.models.constants.AuditoriumFeatures;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Auditorium extends BaseModel {
    private String name;
    private int capacity;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<AuditoriumFeatures> auditoriumFeatures;
    @OneToMany
    private List<Show> shows;
    @OneToMany
    private List<Seat> seats;
}
