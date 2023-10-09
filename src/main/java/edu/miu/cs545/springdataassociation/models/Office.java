package edu.miu.cs545.springdataassociation.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Office {
    @Id
    private Long id;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "physical_address_street")),
            @AttributeOverride(name = "city", column = @Column(name = "physical_address_city")),
            @AttributeOverride(name = "state", column = @Column(name = "physical_address_state")),
            @AttributeOverride(name = "zipCode", column = @Column(name = "physical_address_zip_code"))
    })
    private Address physicalAddress;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "mailling_address_street")),
            @AttributeOverride(name = "city", column = @Column(name = "mailling_address_city")),
            @AttributeOverride(name = "state", column = @Column(name = "mailling_address_state")),
            @AttributeOverride(name = "zipCode", column = @Column(name = "mailling_address_zip_code"))
    })
    @Nullable
    private Address maillingAddress;

    @OneToMany(mappedBy = "office")
    private List<Employee> employees;
}
