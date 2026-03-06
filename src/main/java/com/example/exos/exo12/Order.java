package com.example.exos.exo12;

import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table("orders")
public class Order {

    @Id
    private Long id;

    private String customerName;

    private Double totalAmount;

    private StatusEnum status;

    private LocalDateTime createdAt;

    public Order(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
