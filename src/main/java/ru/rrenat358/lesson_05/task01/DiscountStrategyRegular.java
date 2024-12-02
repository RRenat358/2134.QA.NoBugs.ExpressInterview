package ru.rrenat358.lesson_05.task01;

public class DiscountStrategyRegular implements DiscountInterface{


    @Override
    public double calculation(double amount) {
        return amount * 0.05;
    }


}
