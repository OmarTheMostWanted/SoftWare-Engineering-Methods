package CreationalPatterns.AbstractFactory;

/**
 * abstracts the factories and the object creation.
 */
public abstract class Factory {

    public abstract int getNumberOfProducts();

    public abstract Product createProduct();

}
