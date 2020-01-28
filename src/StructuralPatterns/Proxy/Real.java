package StructuralPatterns.Proxy;

/**
 * heavy object.
 */
public class Real implements DoSomthing {

    @Override
    public void functionA() {
        System.out.println("Actually doing Something A");
    }

    @Override
    public void functionB() {
        System.out.println("Actually doing Something B");
    }
}
