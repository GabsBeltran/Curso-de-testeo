package com.platzi.javatest.discounts;
import java.util.ArrayList;
import java.util.List;
public class PriceCalculator {
    private List<Double> prices = new ArrayList<>();
    private double discount;

    public double getTotal() {
        double result=0;
        for (Double price : prices) {
            result += price;
        }
        return result * ((100- discount)/ 100);
    }

    public void addPrice(double price) {
        prices.add(price);

    }

    public void setDescuento(double discount) {

        this.discount = discount;
    }
}
