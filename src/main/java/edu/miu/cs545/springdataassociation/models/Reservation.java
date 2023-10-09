package edu.miu.cs545.springdataassociation.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reservation {
    @Id
    private Long id;

    private LocalDate dateAndTime;

    @Nullable private LocalDate pickUpDate;

    @Nullable
    private LocalDate dueDate;

    @Enumerated(EnumType.STRING)
    private ReservationStatus status;

    @ManyToOne
    private Book book;
}
