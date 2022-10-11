package com.veterinary.VeterinaryProject.api.controllers;

import com.veterinary.VeterinaryProject.business.abstracts.PetOwnerService;
import com.veterinary.VeterinaryProject.entities.concretes.PetOwner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/petowners")

public class PetOwnerController {

    public PetOwnerController(PetOwnerService petOwnerService){
        super();
        this.petOwnerService = petOwnerService;
    }

    private PetOwnerService petOwnerService;

    @GetMapping("/getall")
    public List<PetOwner>getAll(){
        return this.petOwnerService.getAll();
    }

    @PostMapping("/add")
    public void add(PetOwner petOwner){
        this.petOwnerService.add(petOwner);
    }

}
