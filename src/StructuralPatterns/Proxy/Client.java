package StructuralPatterns.Proxy;

/**
 * the client interacts with proxy the same way as the real object.
 */
public class Client {
    public static void main(String[] args) {

        //the real functionality is not loaded yet
        Proxy object = new Proxy();

        // now that its needed the real object is loaded.
        object.functionA();
        object.functionB();

    }
}
