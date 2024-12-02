package ru.rrenat358.lesson_05.task01;

public class DiscountStrategyEmployee implements DiscountInterface{


    @Override
    public double calculation(double amount) {
        return amount * 0.30;
    }


}
