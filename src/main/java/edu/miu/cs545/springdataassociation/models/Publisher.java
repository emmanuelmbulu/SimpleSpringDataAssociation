package edu.miu.cs545.springdataassociation.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Publisher {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Nullable
    private String webSite;
    private String taxIdentificationNumber;
    private String businessRegistrationNumber;
    @OneToMany
    @JoinColumn(name = "publisher_id")
    private List<Book> catalog;
}
