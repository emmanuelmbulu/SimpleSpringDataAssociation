package edu.miu.cs545.springdataassociation.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    private Long id;

    @Embedded
    private Person person;

    @Column(name = "customer_account_number", unique = true)
    private String customerID;

    @OneToMany
    @JoinColumn(name = "customer_id")
    private List<Reservation> reservations;
}
