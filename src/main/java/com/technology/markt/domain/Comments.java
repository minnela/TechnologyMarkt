package com.technology.markt.domain;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@Table(name = "comment_table")
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment")
    private Devices comment;

    public Comments(String name, Devices comment) {
        this.name = name;
        this.comment = comment;
    }

    public Comments() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Devices getComment() {
        return comment;
    }

    public void setComment(Devices comment) {
        this.comment = comment;
    }
}
