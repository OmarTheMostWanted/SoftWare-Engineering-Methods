package CreationalPatterns.FactroyMethod.ConcreteCreators;

import CreationalPatterns.FactroyMethod.ConcreteProducts.ProductA;
import CreationalPatterns.FactroyMethod.ConcreteProducts.ProductB;
import CreationalPatterns.FactroyMethod.ConcreteProducts.ProductC;
import CreationalPatterns.FactroyMethod.Factoy;
import CreationalPatterns.FactroyMethod.Product;
import CreationalPatterns.FactroyMethod.Type;


/**
 * another way of creating objects.
 */
public class CreatorB extends Factoy {

    private final String string = "created by Creator B";

    /**
     * Creates objects.
     *
     * @param type type of object to be created.
     * @return object.
     */
    @Override
    public Product factoryMethod(Type type) {

        switch (type) {
            case ProductA:
                return new ProductA(string);
            case ProductB:
                return new ProductB(string);
            case ProductC:
                return new ProductC(string);
            default:
                return null;
        }
    }
}
