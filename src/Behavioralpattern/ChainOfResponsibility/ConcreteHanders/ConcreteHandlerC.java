package Behavioralpattern.ChainOfResponsibility.ConcreteHanders;

import Behavioralpattern.ChainOfResponsibility.Handler;
import Behavioralpattern.ChainOfResponsibility.Order;

public class ConcreteHandlerC extends Handler {
    public ConcreteHandlerC(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Order order) {
        if (order.equals(Order.OrderC)) {
            System.out.println(order + " is being handled by C");
        } else super.handleRequest(order);
    }
}

