package com.example.cl.alkemy.model;

import jakarta.persistence.*;
import lombok.Data;


import java.util.Set;

@Entity
@Table(name = "roles")
@Data
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;}

