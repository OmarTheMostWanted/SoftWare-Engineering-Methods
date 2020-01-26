package FactoryMethod.ConcreteFactories;

import FactoryMethod.ConcreteProducts.ProductB;
import FactoryMethod.Factory;
import FactoryMethod.Product;
import FactoryMethod.Type;

public class FactoryB extends Factory {


    private static int numberOfProducts = 0;

    @Override
    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    @Override
    public Product factoryMethod() {
        numberOfProducts++;
        return new ProductB(Type.ProductB + " number: " + numberOfProducts);
    }

}
