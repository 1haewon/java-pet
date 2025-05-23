package com.example.java_pet.service;

import com.example.java_pet.domain.Entry;

import java.util.List;
import java.util.Optional;

public interface EntryService {
    Entry create(Entry entry);

    List<Entry> findAll();

    Optional<Entry> findById(Long id);

    void deleteById(Long id);

    Entry update(Long id, Entry toUpdate);

}
