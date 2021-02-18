package com.restapi.controllers;

import com.restapi.model.Contract;
import com.restapi.repository.ContractRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ContractController {

    final
    ContractRepository contractRepository;

    public ContractController(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    @GetMapping("/contracts")
    List<Contract> getAllContracts() {
        return contractRepository.findAll();
    }
}
