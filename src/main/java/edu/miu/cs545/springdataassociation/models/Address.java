package edu.miu.cs545.springdataassociation.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
@Data
public class Address {
    private String street;
    private String city;
    private String state;
    private Long zipCode;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(street);
        sb.append(", ").append(city);
        sb.append(", ").append(state);
        sb.append(" ").append(zipCode);
        return sb.toString();
    }
}
