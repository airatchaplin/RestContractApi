package com.restapi.controllers;

import com.restapi.model.Contract;
import com.restapi.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ContractController {

    @Autowired
    ContractRepository contractRepository;

    @GetMapping("/contracts")
    List<Contract> getAllContracts() {
        List<String> list = new ArrayList<>();
        List<Contract> contracts = contractRepository.findAll();
        list.add("one");
        return contracts;
    }
}
