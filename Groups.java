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
public class Groups {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    private String name;

    private String description;

    @ManyToOne
    private Users user;

    @OneToMany(orphanRemoval = true, mappedBy = "group")
    private Set<UserGroups> userGroups;
}
