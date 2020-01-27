package CreationalPatterns.AbstractFactory.ConcreteProducts;

import CreationalPatterns.AbstractFactory.Product;

public class ProductB implements Product {

    private String string;

    public ProductB(String string) {
        this.string = string;
    }


    @Override
    public void function() {
        System.out.println("Executing function of Product B with String: " + string);
    }

    @Override
    public String getString() {
        return string;
    }
}
