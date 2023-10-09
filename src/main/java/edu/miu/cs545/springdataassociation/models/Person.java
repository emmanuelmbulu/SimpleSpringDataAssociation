package edu.miu.cs545.springdataassociation.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
@Data
public class Person {
    private String firstName;
    private String lastName;

    @Nullable
    private String middleName;

    private LocalDate birthDate;
    private String gender;
    private String emailAddress;

    private Address address;

    public String getFullName() {
        if(this.middleName != null) return String.format(
                "%s %s %s", firstName, middleName, lastName
        );
        return String.format(
                "%s %s", firstName, lastName
        );
    }
}
