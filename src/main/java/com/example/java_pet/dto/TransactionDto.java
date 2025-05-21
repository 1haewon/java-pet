package com.example.java_pet.dto;


import java.math.BigDecimal;
import java.time.LocalDate;
import com.example.java_pet.domain.Entry;


public class TransactionDto {
    private Long id;
    private LocalDate date;
    private String category;
    private BigDecimal amount;
    private String description;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public TransactionDto() { }

    public TransactionDto(Long id, LocalDate date, String category, BigDecimal amount, String description) {
        this.id = id;
        this.date = date;
        this.category = category;
        this.amount = amount;
        this.description = description;
    }

    public static TransactionDto fromEntity(Entry e) {
        TransactionDto dto = new TransactionDto();
        dto.setId(e.getId());
        dto.setDate(e.getDate());
        dto.setCategory(e.getCategory());
        dto.setAmount(e.getAmount());
        dto.setDescription(e.getDescription());
        return dto;
    }
}
