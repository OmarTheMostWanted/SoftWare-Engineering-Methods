package CreationalPatterns.AbstractFactory.ConcreteProducts;

import CreationalPatterns.AbstractFactory.Product;

public class ProductA implements Product {

    private String string;

    public ProductA(String string) {
        this.string = string;
    }


    @Override
    public void function() {
        System.out.println("Executing function of: " + string);
    }

    @Override
    public String getString() {
        return string;
    }
}
