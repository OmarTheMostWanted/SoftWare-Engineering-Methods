package CreationalPatterns.AbstractFactory.ConcreteFactories;

import CreationalPatterns.AbstractFactory.ConcreteProducts.ProductB;
import CreationalPatterns.AbstractFactory.Factory;
import CreationalPatterns.AbstractFactory.Product;
import CreationalPatterns.AbstractFactory.Type;

public class FactoryB extends Factory {


    private static int numberOfProducts = 0;

    @Override
    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    @Override
    public Product createProduct() {
        numberOfProducts++;
        return new ProductB(Type.ProductB + " number: " + numberOfProducts);
    }

}
