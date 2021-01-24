package com.technology.markt.domain;

import javax.persistence.*;

@Entity
@Table(name = "computer")
public class Computer extends Devices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
