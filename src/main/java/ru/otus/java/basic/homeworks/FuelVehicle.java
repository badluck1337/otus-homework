package ru.otus.java.basic.homeworks;

public abstract class FuelVehicle extends Vehicle{
    protected double petrol;
    public void addPetrol(double petrol) {
        this.petrol += petrol;
    }
    protected void petrolError(){
        System.out.println("Недостаточно топлива!");
    }
}
