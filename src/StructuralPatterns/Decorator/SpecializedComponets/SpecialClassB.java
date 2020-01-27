package StructuralPatterns.Decorator.SpecializedComponets;

import StructuralPatterns.Decorator.Component;
import StructuralPatterns.Decorator.SpecializedComponent;


/**
 * Some responsibilities that can be withdrawn such as operationB.
 */
public class SpecialClassB extends SpecializedComponent {

    public SpecialClassB(Component component, String string) {
        super(component, string);
    }


    @Override
    public void operationA() {
        System.out.println("SpecializedComponent Basic operation A by class B");

    }

    public void newBehavior() {
        System.out.println("New behavior by class B");
    }
}