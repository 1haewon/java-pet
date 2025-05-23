package com.example.java_pet.controller;

import com.example.java_pet.domain.Entry;
import com.example.java_pet.dto.TransactionCreateRequest;
import com.example.java_pet.dto.TransactionResponse;
import com.example.java_pet.service.EntryService;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final EntryService service;

    public TransactionController(EntryService service) {
        this.service = service;
    }

    @PostMapping
    public TransactionResponse create(
            @RequestBody TransactionCreateRequest req
    ) {
        Entry saved = service.create(req.toEntity());
        return TransactionResponse.fromEntity(saved);
    }

    @GetMapping
    public List<TransactionResponse> listAll() {
        return service.findAll().stream()
                .map(TransactionResponse::fromEntity)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public TransactionResponse getById(
            @PathVariable Long id
    ) {
        return service.findById(id)
                .map(TransactionResponse::fromEntity)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,"ID not found: " + id
                ));
    }

    @PutMapping("/{id}")
    public TransactionResponse update(
            @PathVariable Long id,
            @RequestBody TransactionCreateRequest req
    ) {
        Entry toUpdate = req.toEntity();
        toUpdate.setId(id);
        Entry updated = service.update(id, toUpdate);
        return TransactionResponse.fromEntity(updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}
