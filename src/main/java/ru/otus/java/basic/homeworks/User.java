package ru.otus.java.basic.homeworks;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class User {
    private String name,surname,patronymic,email;
    private Instant yearOfBirth;

    public User (String name,String surname, String patronymic, String email, Instant yearOfBirth){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.email = email;
        this.yearOfBirth = yearOfBirth;
    }

    public void print(){
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd.MM.yyyy")
                        .withZone(ZoneId.systemDefault());
        System.out.printf("""
                ФИО: %s %s %s
                Год рождения: %s
                e-mail: %s
                %n""", surname,name,patronymic,formatter.format(yearOfBirth),email);
    }


}
