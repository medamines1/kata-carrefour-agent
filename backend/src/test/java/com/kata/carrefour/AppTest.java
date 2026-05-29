package com.kata.carrefour;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(LeaseController.class)
class AppTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldCreateLease() throws Exception {
        mockMvc.perform(post("/api/leases")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("""
                                {
                                  "customerName": "Sam",
                                  "carModel": "Peugeot 3008",
                                  "durationMonths": 24
                                }
                                """))
                .andExpect(status().isOk())
                .andExpect(content().json("""
                        {"message":"Lease confirmed for Sam: Peugeot 3008 for 24 months."}
                        """));
    }
}
