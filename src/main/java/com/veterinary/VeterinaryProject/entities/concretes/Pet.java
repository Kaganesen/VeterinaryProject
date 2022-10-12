package com.veterinary.VeterinaryProject.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pets")

public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name ="species")
    private String species;

    @Column (name ="straing")
    private String strain;

    @Column (name ="name")
    private String name;

    @Column (name ="age")
    private String age;

    @Column (name ="description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "petowner_id")
    private PetOwner petOwner;

}
