package com.technology.markt.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "computer")
public class Computer extends Devices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany(mappedBy = "computer", cascade=CascadeType.ALL)
    private Set<ComputerComments> comments = new HashSet<ComputerComments>();

}
