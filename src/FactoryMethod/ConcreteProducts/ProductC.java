package FactoryMethod.ConcreteProducts;

import FactoryMethod.Product;

public class ProductC implements Product {

    private String string;

    public ProductC(String string) {
        this.string = string;
    }


    @Override
    public void function() {
        System.out.println("Executing function of Product C with String: " + string);
    }

    @Override
    public String getString() {
        return string;
    }
}
