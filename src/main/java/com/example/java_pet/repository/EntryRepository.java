package com.example.java_pet.repository;

import com.example.java_pet.domain.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface EntryRepository extends JpaRepository<Entry, Long> {
    }

