package CreationalPatterns.AbstractFactory.ConcreteFactories;

import CreationalPatterns.AbstractFactory.ConcreteProducts.ProductC;
import CreationalPatterns.AbstractFactory.Factory;
import CreationalPatterns.AbstractFactory.Product;
import CreationalPatterns.AbstractFactory.Type;

public class FactoryC extends Factory {


    private static int numberOfProducts = 0;

    @Override
    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    @Override
    public Product createProduct() {
        numberOfProducts++;
        return new ProductC(Type.ProductC + " number: " + numberOfProducts);
    }

}
