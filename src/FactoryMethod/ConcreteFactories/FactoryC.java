package FactoryMethod.ConcreteFactories;

import FactoryMethod.ConcreteProducts.ProductC;
import FactoryMethod.Factory;
import FactoryMethod.Product;
import FactoryMethod.Type;

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
