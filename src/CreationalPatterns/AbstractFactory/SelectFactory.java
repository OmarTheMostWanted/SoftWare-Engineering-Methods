package CreationalPatterns.AbstractFactory;

import CreationalPatterns.AbstractFactory.ConcreteFactories.FactoryA;
import CreationalPatterns.AbstractFactory.ConcreteFactories.FactoryB;
import CreationalPatterns.AbstractFactory.ConcreteFactories.FactoryC;

/**
 * abstracts the way factories are created and used.
 */
public class SelectFactory {

    private FactoryA factoryA;
    private FactoryB factoryB;
    private FactoryC factoryC;


    public SelectFactory() {
        factoryA = new FactoryA();
        factoryB = new FactoryB();
        factoryC = new FactoryC();
    }

    public Product createProduct(Type type) {
        switch (type) {
            case ProductA:
                return factoryA.createProduct();

            case ProductB:
                return factoryB.createProduct();

            case ProductC:
                return factoryC.createProduct();

            default:
                return null;
        }
    }
}
