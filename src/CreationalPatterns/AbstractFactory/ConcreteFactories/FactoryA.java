package CreationalPatterns.AbstractFactory.ConcreteFactories;

import CreationalPatterns.AbstractFactory.ConcreteProducts.ProductA;
import CreationalPatterns.AbstractFactory.Factory;
import CreationalPatterns.AbstractFactory.Product;
import CreationalPatterns.AbstractFactory.Type;

public class FactoryA extends Factory {


    private static int numberOfProducts = 0;


    @Override
    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    @Override
    public Product createProduct() {
        numberOfProducts++;
        return new ProductA(Type.ProductA + " number: " + numberOfProducts);
    }

}
