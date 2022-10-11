package com.veterinary.VeterinaryProject.dataAccess.abstracts;

import com.veterinary.VeterinaryProject.entities.concretes.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetDao extends JpaRepository<Pet,Integer> {

}
