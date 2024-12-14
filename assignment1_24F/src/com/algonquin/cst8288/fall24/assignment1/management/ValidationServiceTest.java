package com.algonquin.cst8288.fall24.assignment1.management;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidationServiceTest {

    private final ValidationService validationService = new ValidationService();

    @Test
    void testValidateName() {
        assertTrue(validationService.validateName("John Doe"));
        assertFalse(validationService.validateName("")); // Empty name
        assertFalse(validationService.validateName(null)); // Null name
    }

    @Test
    void testValidateEmail() {
        assertTrue(validationService.validateEmail("john.doe@example.com"));
        assertFalse(validationService.validateEmail("john.doe")); // Missing domain
        assertFalse(validationService.validateEmail("john.doe@.com")); // Invalid domain
    }

    @Test
    void testValidatePhone() {
        assertTrue(validationService.validatePhone("1234567890")); // Valid phone number
        assertFalse(validationService.validatePhone("12345")); // Too short
        assertFalse(validationService.validatePhone("abcd1234")); // Invalid characters
    }
}
