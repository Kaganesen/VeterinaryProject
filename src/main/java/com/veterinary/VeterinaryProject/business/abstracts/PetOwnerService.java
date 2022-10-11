package com.veterinary.VeterinaryProject.business.abstracts;

import com.veterinary.VeterinaryProject.entities.concretes.PetOwner;

import java.util.List;

public interface PetOwnerService {

    List<PetOwner>getAll();

    void add(PetOwner petOwner);
}
