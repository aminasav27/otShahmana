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
public class Skills {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    private String name;

    private String description;

    @OneToMany(orphanRemoval = true, mappedBy = "skill")
    private Set<UserGroups> userGroups;
}
