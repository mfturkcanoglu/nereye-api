package com.astrainnovations.nereye.restapi.user;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "users")
@Data
public class UserEntity {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "BINARY(16)", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "username", length = 30, unique = true, nullable = false)
    private String username;

    @Column(name = "email", length = 100, unique = true, nullable = false)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "full_name", length = 100)
    private String fullName;

    @Column(name = "surname", length = 100)
    private String surname;

    @Column(name = "verified")
    private Boolean verified;

    @Column(name = "enabled")
    private Boolean enabled;

    @Column(name = "active")
    private Boolean active;
}