package FactoryMethod.ConcreteFactories;

import FactoryMethod.ConcreteProducts.ProductA;
import FactoryMethod.Factory;
import FactoryMethod.Product;
import FactoryMethod.Type;

public class FactoryA extends Factory {


    private static int numberOfProducts = 0;


    @Override
    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    @Override
    public Product factoryMethod() {
        numberOfProducts++;
        return new ProductA(Type.ProductA + " number: " + numberOfProducts);
    }

}
