package com.technology.markt.domain;


import javax.persistence.*;

@Entity
@Table(name = "mobile_phone")
public class MobilePhone extends Devices{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
