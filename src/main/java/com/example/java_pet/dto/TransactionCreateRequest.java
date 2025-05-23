package com.example.java_pet.dto;

import com.example.java_pet.controller.TransactionController;
import com.example.java_pet.domain.Entry;
import jakarta.transaction.Transaction;
import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TransactionCreateRequest {

    private LocalDate date;
    private String category;
    private BigDecimal amount;
    private String description;

    public TransactionCreateRequest() { }

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

    public Entry toEntity() {
        return new Entry(date, description, amount, category);
    }
}
