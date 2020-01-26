package ChainOfResponsibility.ConcreteHanders;

import ChainOfResponsibility.Handler;
import ChainOfResponsibility.Order;

public class ConcreteHandlerB extends Handler {

    public ConcreteHandlerB(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Order order) {
        if (order.equals(Order.OrderB)) {
            System.out.println(order + " is being handled by B");
        } else super.handleRequest(order);
    }
}
