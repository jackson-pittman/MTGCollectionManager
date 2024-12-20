package com.mtg.collection.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity(name = "user")
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "passowrd", nullable = false)
    private String password;

    @Column(name = "status")
    private String status;

    @Column(name = "role")
    private String role;
    /*
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Card> cards;
    */


}
