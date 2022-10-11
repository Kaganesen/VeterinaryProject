package com.veterinary.VeterinaryProject.business.concretes;

import com.veterinary.VeterinaryProject.business.abstracts.PetService;
import com.veterinary.VeterinaryProject.core.DataResult;
import com.veterinary.VeterinaryProject.core.Result;
import com.veterinary.VeterinaryProject.core.SuccessDataResult;
import com.veterinary.VeterinaryProject.core.SuccessResult;
import com.veterinary.VeterinaryProject.dataAccess.abstracts.PetDao;
import com.veterinary.VeterinaryProject.entities.concretes.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetManager implements PetService {

    private final PetDao petDao;

    @Autowired
    public PetManager(PetDao petDao) {
        this.petDao = petDao;
    }


    @Override
    public DataResult<List<Pet>> getAll() {
        List<Pet> pets = this.petDao.findAll();
        return new SuccessDataResult<>(pets , "Listed data");
    }

    @Override
    public Result add(Pet pet) {
        this.petDao.save(pet);
        return new SuccessResult("Added data.");

    }
}
