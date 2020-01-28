package StructuralPatterns.Proxy;


/**
 * this provides the exact same interface but it does not do the complex and heave things until they are needed.
 *
 * This is not an:
 * Adapter because an adapter provides a different interface to wrap and object.
 * Decorator because a decorator provides extra functionality.
 * Facade because a facade provides a simplified interface to the other objects.
 *
 */
public class Proxy implements DoSomthing {

    private DoSomthing real;


    @Override
    public void functionA() {
        if (real == null) {
            real = new Real();
        }
        real.functionA();
    }

    @Override
    public void functionB() {
        if (real == null) {
            real = new Real();
        }
        real.functionB();
    }
}
