package com.veterinary.VeterinaryProject.business.abstracts;

import com.veterinary.VeterinaryProject.core.DataResult;
import com.veterinary.VeterinaryProject.core.Result;
import com.veterinary.VeterinaryProject.entities.concretes.Pet;

import java.util.List;


public interface PetService {

    DataResult<List<Pet>> getAll();

    Result add(Pet pet);

}
