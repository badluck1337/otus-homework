package ru.otus.java.basic.homeworks;

import java.awt.*;

public class Box {
    private Color color;
    private boolean open;
    private String item;
    private final double size;
    public Box(Color color, boolean open,String item,double size){
        this.color = color;
        this.open = open;
        this.item = item;
        this.size = size;
    }
    public void setColor(Color color) {
        System.out.println("ПЕРЕКРАШИВАЕМ");
        this.color = color;
    }

    public void print(){
        System.out.printf("""
                Цвет: %s
                Открыта коробка: %s
                Какой предмет лежит в коробке: %s
                Размер коробки: %s
                """,color,open,item,size);
    }

    public void addItem(String item) {
        if(open && this.item == null){
            System.out.println("КЛАДЕМ " + item);
            this.item = item;
        }else {
            System.out.println("Коробка закрыта или она уже полна");
        }
    }
    public void dropItem() {
        if(open && item != null){
            System.out.println("ВЫКИДЫВАЕМ " + item);
            item = null;
        }else {
            System.out.println("Коробка закрыта или она пустая");
        }
    }

    public void open(){
        if(open){
            System.out.println("Уже открыта");
        }else {
            open = true;
            System.out.println("Открываем");
        }
    }
    public void close(){
        if(!open){
            System.out.println("Уже закрыта");
        }else {
            open = false;
            System.out.println("Закрываем");
        }
    }
}
