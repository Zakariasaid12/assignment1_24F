package com.algonquin.cst8288.fall24.assignment1.management;

public class ValidationService {

    public boolean validateName(String name) {
        return name != null && !name.trim().isEmpty() && name.matches("[A-Za-z0-9 ]+");
    }

    public boolean validateEmail(String email) {
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    public boolean validatePhone(String phone) {
        return phone != null && phone.matches("\\d{10}");
    }
}
