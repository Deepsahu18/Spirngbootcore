package com.itvedant.Student;

import org.springframework.stereotype.Component;

@Component
public class Student {
    Student(){
        System.out.println("\nStudent Object created...\n");
    }
    public void print(){
        System.out.println("\nPrint method of the student class");
    }
}
