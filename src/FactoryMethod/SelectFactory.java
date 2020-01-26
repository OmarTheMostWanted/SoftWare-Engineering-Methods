package FactoryMethod;

import FactoryMethod.ConcreteFactories.FactoryA;
import FactoryMethod.ConcreteFactories.FactoryB;
import FactoryMethod.ConcreteFactories.FactoryC;

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
                return factoryA.factoryMethod();

            case ProductB:
                return factoryB.factoryMethod();

            case ProductC:
                return factoryC.factoryMethod();

            default:
                return null;
        }
    }
}
