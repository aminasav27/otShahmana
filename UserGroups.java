package com.example.otshahmana.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserGroups {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @ManyToOne
    private Users user;

    @ManyToOne
    private Groups group;

    @ManyToOne
    private Skills skill;

    private String status;

    private String idConnection;

    private boolean state;
}
