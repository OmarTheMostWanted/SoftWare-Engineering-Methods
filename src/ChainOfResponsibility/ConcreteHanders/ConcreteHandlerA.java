package ChainOfResponsibility.ConcreteHanders;

import ChainOfResponsibility.Handler;
import ChainOfResponsibility.Order;

public class ConcreteHandlerA extends Handler {

    /**
     * it uses the default constructor.
     * @param next next handler in the chain.
     */
    public ConcreteHandlerA(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Order order) {
        if (order.equals(Order.OrderA)) {
            System.out.println(order + " is being handled by A");
        } else super.handleRequest(order);
    }
}
