package com.test.domain;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user")
public class User {


    @Id
    @JoinColumn(name = "id", nullable = false)
    private int id;

    @JoinColumn(name = "username", nullable = false)
    private String username;

    @JoinColumn(name = "password", nullable = false)
    private String password;

    @JoinColumn(name = "context")
    private String context;

}
