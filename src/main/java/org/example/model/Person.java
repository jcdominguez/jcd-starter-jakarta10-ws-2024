package org.example.model;

import java.time.LocalDate;

public record Person(
        String firstName,
        String lastName,
        LocalDate birthday
)
{}