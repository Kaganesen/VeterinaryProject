package com.veterinary.VeterinaryProject.api.controllers;

import com.veterinary.VeterinaryProject.business.abstracts.PetService;
import com.veterinary.VeterinaryProject.core.DataResult;
import com.veterinary.VeterinaryProject.core.Result;
import com.veterinary.VeterinaryProject.entities.concretes.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pets")

public class PetController {

    private final PetService petService;


    @Autowired
    public PetController(PetService petService){
        super();
        this.petService = petService;
    }

    @GetMapping("/getall")
    public DataResult<List<Pet>> getAll(){
        return this.petService.getAll();
    }

    @PostMapping("/add")
    public Result add(Pet pet){
        return this.petService.add(pet);
    }


}


