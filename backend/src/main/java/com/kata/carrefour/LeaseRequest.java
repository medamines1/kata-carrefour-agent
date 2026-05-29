package com.kata.carrefour;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record LeaseRequest(
        @NotBlank String customerName,
        @NotBlank String carModel,
        @Min(1) int durationMonths) {
}
