package ru.rrenat358.lesson_05.task01;

public class ChoseDiscountStrategy {


    public DiscountStrategy getStrategy(CustomerType customerType) {

        switch (customerType) {
            case REGULAR -> new DiscountStrategyRegular();
            case VIP -> new DiscountStrategyVip();
            case EMPLOYEE -> new DiscountStrategyEmployee();
            default -> throw new RuntimeException("Не верный CustomerType ");


        }

        return null;

    }

}
