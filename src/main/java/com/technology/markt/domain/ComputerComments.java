package com.technology.markt.domain;

import javax.persistence.*;

@Entity
@Table(name = "comment_computer")
public class ComputerComments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name = "comp_id")
    private Computer computer;

    @Column(name= "compbrand")
    private String compBrand;

    @Column(name= "commentComp")
    private String commentComp;

    @Column(name= "commentCompOs")
    private String commentCompOs;

    public ComputerComments() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public String getCommentComp() {
        return commentComp;
    }

    public void setCommentComp(String commentComp) {
        this.commentComp = commentComp;
    }

    public String getCompBrand() {
        return compBrand;
    }

    public void setCompBrand(String compBrand) {
        this.compBrand = compBrand;
    }

    public String getCommentCompOs() {
        return commentCompOs;
    }

    public void setCommentCompOs(String commentCompOs) {
        this.commentCompOs = commentCompOs;
    }
}
