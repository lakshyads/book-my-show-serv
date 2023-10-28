package com.lakshya.BookMyShowServ.models;

import com.lakshya.BookMyShowServ.models.constants.MovieFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Show extends BaseModel {
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    @ManyToOne
    private Auditorium auditorium;
    @ManyToOne
    private Movie movie;
    @OneToMany
    private List<ShowSeat> showSeats;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeature> showFeatures;
}
