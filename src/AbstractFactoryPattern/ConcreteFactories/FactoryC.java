package AbstractFactoryPattern.ConcreteFactories;

import AbstractFactoryPattern.ConcreteProducts.ProductC;
import AbstractFactoryPattern.Factory;
import AbstractFactoryPattern.Product;
import AbstractFactoryPattern.Type;

public class FactoryC extends Factory {


    private static int numberOfProducts = 0;

    @Override
    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    @Override
    public Product factoryMethod() {
        numberOfProducts++;
        return new ProductC(Type.ProductC + " number: " + numberOfProducts);
    }

}
