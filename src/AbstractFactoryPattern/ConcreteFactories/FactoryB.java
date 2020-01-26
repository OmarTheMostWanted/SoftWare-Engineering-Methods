package AbstractFactoryPattern.ConcreteFactories;

import AbstractFactoryPattern.ConcreteProducts.ProductB;
import AbstractFactoryPattern.Factory;
import AbstractFactoryPattern.Product;
import AbstractFactoryPattern.Type;

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
