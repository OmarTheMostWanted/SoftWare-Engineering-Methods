package StructuralPatterns.Facade;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade(new ComplexAPI());

        //this allows the client to interact with different system components.
        facade.doOperationA();

        facade.doOperationB();

        facade.callAPI();
    }
}
