package CreationalPatterns.FactroyMethod;

/**
 * this abstracts only how the objects are created.
 * One factory can create multiple objects we can have more than one factory to change the way objects are created.
 */
public abstract class Factoy {

    public abstract Product factoryMethod(Type type);

    public void factoryFunction() {
        System.out.println("Executing the factory method");
    }
}
