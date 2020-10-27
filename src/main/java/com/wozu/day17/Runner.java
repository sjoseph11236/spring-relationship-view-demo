package com.wozu.day17;

import com.wozu.day17.Models.Address;
import com.wozu.day17.Models.Library;
import com.wozu.day17.Repository.AddressRepo;
import com.wozu.day17.Repository.LibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    LibraryRepo libraryRepo;

    @Autowired
    AddressRepo addressRepo;

    @Override
    public void run(String... args) throws Exception {

        Address address = new Address("123 Phillip Street");
//        address.setLibrary(new Library("Brooklyn Public Library"));
        addressRepo.save(address);

        Address otherAddress = new Address("Main St");
//        otherAddress.setLibrary(new Library("Hartford Public Library"));
        addressRepo.save(otherAddress);


        Library library = new Library("Brooklyn Public Library");
        library.setAddress(address);
        libraryRepo.save(library);

        Library otherLibrary = new Library("Hartford Public Library");
        otherLibrary.setAddress(otherAddress);
        libraryRepo.save(otherLibrary);

    }
}

