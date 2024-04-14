package com.example.otshahmana.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    private String login;

    private String firstName;

    private String lastName;

    private String patronymic;

    @OneToMany(orphanRemoval = true, mappedBy = "user")
    private Set<UserGroups> userGroups;

    @OneToMany(orphanRemoval = true, mappedBy = "user")
    private Set<Groups> groups;
}
