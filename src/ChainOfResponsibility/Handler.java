package ChainOfResponsibility;

public abstract class Handler {

    private Handler next;

    public Handler(Handler next){
        this.next = next;
    }


    /**
     * Each subclass of the handler has its own handleRequest method.
     * @param order the order.
     */
    public void handleRequest(Order order){
        if(next != null){
            next.handleRequest(order);
        }
    }
}
