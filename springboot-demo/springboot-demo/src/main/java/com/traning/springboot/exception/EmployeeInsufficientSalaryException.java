package com.traning.springboot.exception;

public class EmployeeInsufficientSalaryException extends RuntimeException{
    public EmployeeInsufficientSalaryException(String message) {
        super(message);
    }
}
