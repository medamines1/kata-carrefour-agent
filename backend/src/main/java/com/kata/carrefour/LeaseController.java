package com.kata.carrefour;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/leases")
public class LeaseController {

    @PostMapping
    public LeaseResponse createLease(@Valid @RequestBody LeaseRequest request) {
        String message = "Lease confirmed for " + request.customerName()
                + ": " + request.carModel() + " for " + request.durationMonths() + " months.";
        return new LeaseResponse(message);
    }
}
