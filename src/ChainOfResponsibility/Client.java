package ChainOfResponsibility;

import ChainOfResponsibility.ConcreteHanders.ConcreteHandlerA;
import ChainOfResponsibility.ConcreteHanders.ConcreteHandlerB;
import ChainOfResponsibility.ConcreteHanders.ConcreteHandlerC;

public class Client {

    Handler handlerChain;

    public Client() {
        this.buildChain();
    }

    /**
     * builds the chain of responsibility, each object in the chain checks if its the request is meant for it,
     * if not it passes it to the next chain.
     */
    private void buildChain() {
        handlerChain = new ConcreteHandlerA(new ConcreteHandlerB(new ConcreteHandlerC(null)));
    }

    /**
     * passes the order to the first element in the handler chain.
     * @param order the order, its unknown which handler in the chain is responsible for it.
     */
    public void makeRequest(Order order) {
        handlerChain.handleRequest(order);
    }
}