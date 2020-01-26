package ChainOfResponsibility;

public abstract class Handler {

    private Handler next;

    public Handler(Handler next){
        this.next = next;
    }

    public void handleRequest(Order order){
        if(next != null){
            next.handleRequest(order);
        }
    }
}
