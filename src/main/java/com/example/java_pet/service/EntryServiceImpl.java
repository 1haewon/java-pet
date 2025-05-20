package com.example.java_pet.service;

import com.example.java_pet.domain.Entry;
import com.example.java_pet.repository.EntryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EntryServiceImpl implements EntryService{

    private final EntryRepository repo;

    // 생성자를 통한 의존성 주입
    public EntryServiceImpl(EntryRepository repo) {
        this.repo = repo;
    }

    @Override
    public Entry create(Entry entry) {
        return repo.save(entry);
    }

    @Override
    @Transactional(readOnly = true) // 조회 전용 트랜잭션
    public List<Entry> findAll() {
        return repo.findAll();
    }

    @Override
    @Transactional(readOnly = true) // 조회 전용 트랜잭션
    public Optional<Entry> findById(Long id) {
        return findById(id);
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }


}

