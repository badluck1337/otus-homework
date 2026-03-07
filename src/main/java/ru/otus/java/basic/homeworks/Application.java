package ru.otus.java.basic.homeworks;


import module java.base;

public class Application {

    public static void main(String[] args) {

        PhoneBook pb = new PhoneBook();

        pb.add("Бабуин Бибизьян", "+1243554");
        pb.add("Бабуин Бибизьян", "+85465663");
        pb.add("Лосось Лососевич", "+85432365663");

        System.out.println(pb.find("Бабуин Бибизьян"));

        System.out.println(pb.containsPhoneNumber("+85432365663"));

        System.out.println(pb.containsPhoneNumber("+124543554"));
    }


}
