package com.codeup.codeupspringblog.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "dogs")
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "dog_name", length = 50, nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private int age;

    @ManyToOne
    private DogOwner owner;

    // insert M:M relationship with toys here
    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinTable(
            name = "dog_toys",
            joinColumns = {@JoinColumn(name = "dog_id")},
            inverseJoinColumns = {@JoinColumn(name = "toy_id")}
    )
    private List<Toy> toys;
}