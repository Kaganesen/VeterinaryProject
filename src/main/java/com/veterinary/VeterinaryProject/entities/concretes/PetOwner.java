package com.veterinary.VeterinaryProject.entities.concretes;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "petowners")

public class PetOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @Column (name = "first_name")
    @NotNull
    private String firstName;

    @NotNull
    @Column (name = "last_name")
    private String lastName;

    @Column(name = "adress")
    @NotNull
    private String adress;

    @Column (name = "email")
    @NotNull
    private String email;

    @NotNull
    @Column (name = "phone_number")
    private String phoneNumber;


}
