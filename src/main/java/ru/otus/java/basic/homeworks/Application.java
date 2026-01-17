package ru.otus.java.basic.homeworks;

import java.awt.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;


public class Application {
    private static Random random = new Random();

    public static void main(String[] args) {

        User[] users = new User[10];
        String[] arrayName = {
                "Petya",
                "Vasya",
                "Anton"
        };
        String[] arraySurname = {
                "Vasielv",
                "Babuinov",
                "Makakuinov"
        };

        String[] arrayPatronymic = {
                "Antonevich",
                "Babuinovich",
                "Makakakovich"
        };
        String[] arrayEmails = {
                "Antonevich@mail.ru",
                "Babuinovich@mail.ru",
                "Makakakovich@mail.ru"
        };

        for (int i = 0; i < users.length; i++) {
            Date date = new Date(125 - random.nextInt(50),12 - random.nextInt(11),25 - random.nextInt(24));
            users[i] = new User(arrayName[random.nextInt(arrayName.length)],
                    arraySurname[random.nextInt(arraySurname.length)],
                    arrayPatronymic[random.nextInt(arrayPatronymic.length)],
                    arrayEmails[random.nextInt(arrayEmails.length)],
                    date.toInstant()
                    );

               if(date.before(Date.from(LocalDate.now().minusYears(40).atStartOfDay().toInstant(ZoneOffset.UTC)))){
                   users[i].print();
               }
        }

        Box box = new Box(Color.red,false,"ЛУПА",3);
        box.addItem("лупа2");
        box.dropItem();
        box.print();
        box.setColor(Color.gray);
        box.open();
        box.dropItem();
        box.addItem("лупа2");
        box.print();
    }


}
