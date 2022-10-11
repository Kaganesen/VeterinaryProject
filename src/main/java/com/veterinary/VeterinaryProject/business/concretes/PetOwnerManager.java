package com.veterinary.VeterinaryProject.business.concretes;

import com.veterinary.VeterinaryProject.business.abstracts.PetOwnerService;
import com.veterinary.VeterinaryProject.dataAccess.abstracts.PetOwnerDao;
import com.veterinary.VeterinaryProject.entities.concretes.PetOwner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetOwnerManager  implements PetOwnerService {

    private final PetOwnerDao petOwnerDao;

    public PetOwnerManager(PetOwnerDao petOwnerDao){
        this.petOwnerDao = petOwnerDao;
    }

    @Override
    public List<PetOwner> getAll() {
        return this.petOwnerDao.findAll();
    }

    @Override
    public void add(PetOwner petOwner) {
        this.petOwnerDao.save(petOwner);

    }
}
