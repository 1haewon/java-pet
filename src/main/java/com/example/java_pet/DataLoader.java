package com.example.java_pet;

import com.example.java_pet.domain.Entry;
import com.example.java_pet.repository.EntryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final EntryRepository repo;

    public DataLoader(EntryRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception {
        // 1) 저장
        Entry e1 = new Entry(LocalDate.now(), "테스트", new BigDecimal("1000"));
        repo.save(e1);
        System.out.println("saved: " + e1.getId());

        // 2) findAll
        System.out.println("all entries: " + repo.findAll());

        // 3) findById (없는 ID)
        System.out.println("findById(999): " + repo.findById(999L));

        // 4) deleteById
        repo.deleteById(e1.getId());
        System.out.println("deleted, count: " + repo.count());
    }
}
