package src.FactoryPattern;

import src.FactoryPattern.Pizza.Pizza;
import src.FactoryPattern.PizzaStore.ChicagoPizzaStore;
import src.FactoryPattern.PizzaStore.NYPizzaStore;
import src.FactoryPattern.PizzaStore.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("Cheese");
        System.out.println("Customer 1 ordered: " + pizza.getName());

        pizza = chicagoStore.orderPizza("Cheese");
        System.out.println("Customer 2 ordered: " + pizza.getName());
    }
}
