package AbstractFactoryPattern.ConcreteFactories;

import AbstractFactoryPattern.ConcreteProducts.ProductA;
import AbstractFactoryPattern.Factory;
import AbstractFactoryPattern.Product;
import AbstractFactoryPattern.Type;

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
