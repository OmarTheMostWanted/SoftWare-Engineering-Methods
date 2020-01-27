package StructuralPatterns.Decorator;

/**
 * this class just simple implements the interface.
 */
public class BasicComponent implements Component {

    private String string;

    public BasicComponent(String string){
        this.string = string;
    }

    public BasicComponent(){
        this.string = "Basic Component";
    }

    @Override
    public void operationA() {
       System.out.println("Basic operation A");
    }

    @Override
    public void operationB() {
        System.out.println("Basic operation B");
    }
}
