package ru.pafolder.firstwebapp.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Person {
    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 2, max = 30, message = "Имя должно быть длиной от 2 до 30 символов")
    String firstName;
    String lastName;
    int age;
}
