package com.example.java_pet.dto;

import com.example.java_pet.domain.Entry;
import java.math.BigDecimal;
import java.time.LocalDate;

public class TransactionResponse {
    private Long id;
    private LocalDate date;
    private String category;
    private BigDecimal amount;
    private String description;


    public TransactionResponse(Long id,
                               LocalDate date,
                               String category,
                               BigDecimal amount,
                               String description) {
        this.id = id;
        this.date = date;
        this.category = category;
        this.amount = amount;
        this.description = description;
    }
    public static TransactionResponse fromEntity(Entry e) {
        return new TransactionResponse(
                e.getId(),
                e.getDate(),
                e.getCategory(),
                e.getAmount(),
                e.getDescription()
        );
    }


    public Long getId() {
        return id;
    }
    public LocalDate getDate() {
        return date;
    }
    public String getCategory() {
        return category;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public String getDescription() {
        return description;
    }
}
