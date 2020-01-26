package ChainOfResponsibility;

import ChainOfResponsibility.ConcreteHanders.ConcreteHanderA;
import ChainOfResponsibility.ConcreteHanders.ConcreteHanderB;
import ChainOfResponsibility.ConcreteHanders.ConcreteHandlerC;

public class Client {

    Handler handlerChain;

    public Client() {
        this.buildChain();
    }

    private void buildChain() {
        handlerChain = new ConcreteHanderA(new ConcreteHanderB(new ConcreteHandlerC(null)));
    }

    public void makeRequest(Order order) {
        handlerChain.handleRequest(order);
    }
}