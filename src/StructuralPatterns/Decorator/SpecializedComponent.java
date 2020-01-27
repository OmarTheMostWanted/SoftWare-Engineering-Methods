package StructuralPatterns.Decorator;

/**
 * this also implements the same interface as the basic component.
 * But it adds some extra functionality but composing a specialized component.
 * Notice that does not extend BasicComponent.
 * This is classed a decorator Class.
 */
public class SpecializedComponent implements Component {

    private String string;

    //this decorator will add extra functionality and can be changed on run time.
    private Component component;

    /**
     * This allows behavior modification at runtime by chaning the decorator Component
     */
    public SpecializedComponent(Component component, String string) {
        this.component = component;
        this.string = string;
    }

    @Override
    public void operationA() {
        System.out.println("SpecializedComponent Basic operation A");
    }

    @Override
    public void operationB() {
        System.out.println("SpecializedComponent Basic operation B");
    }

    public Component getComponent() {
        return component;
    }

    //dynamically changing some of the class functions.
    public void setComponent(Component component) {
        this.component = component;
    }

}
