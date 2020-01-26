package ChainOfResponsibility.ConcreteHanders;

import ChainOfResponsibility.Handler;
import ChainOfResponsibility.Order;

public class ConcreteHanderB extends Handler {

    public ConcreteHanderB(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Order order) {
        if (order.equals(Order.OrderB)) {
            System.out.println(order + " is being handled by B");
        } else super.handleRequest(order);
    }
}
