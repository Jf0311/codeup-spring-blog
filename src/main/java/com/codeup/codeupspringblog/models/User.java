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
@Table (name = "Users_01")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "User name")
    private String name;


    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Post> posts;



}
