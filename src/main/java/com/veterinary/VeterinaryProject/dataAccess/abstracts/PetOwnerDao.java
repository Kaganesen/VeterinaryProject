package com.veterinary.VeterinaryProject.dataAccess.abstracts;

import com.veterinary.VeterinaryProject.entities.concretes.PetOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetOwnerDao extends JpaRepository<PetOwner,Integer> {
}
