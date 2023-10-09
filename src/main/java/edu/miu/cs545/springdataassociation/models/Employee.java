package edu.miu.cs545.springdataassociation.models;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Person person;

    private String jobTitle;

    @Enumerated(EnumType.STRING)
    private EmploymentStatus employmentStatus;

    @ManyToOne
    private Department department;

    @ManyToOne
    private Office office;
}
