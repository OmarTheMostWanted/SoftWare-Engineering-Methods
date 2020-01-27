package StructuralPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * this is an interface for all the components the make up the composite class
 */
public abstract class CompositeClassComponent {

    private List<CompositeClassComponent> childComponents = new ArrayList<>();

    public void addSubComponent(CompositeClassComponent child) {
        if (!this.childComponents.contains(child)) {
            this.childComponents.add(child);
        }
    }

    /**
     * This will allow the CompositeClass to let clients treat individual objects and compositions of objects uniform
     */
    public abstract void function1();

    public abstract void function2();

}
