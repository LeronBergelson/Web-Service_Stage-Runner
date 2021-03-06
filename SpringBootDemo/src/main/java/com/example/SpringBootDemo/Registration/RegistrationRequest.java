package com.example.SpringBootDemo.Registration;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class RegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public RegistrationRequest(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
}
