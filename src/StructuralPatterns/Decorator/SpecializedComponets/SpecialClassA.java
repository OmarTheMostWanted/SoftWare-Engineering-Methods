package StructuralPatterns.Decorator.SpecializedComponets;

import StructuralPatterns.Decorator.Component;
import StructuralPatterns.Decorator.SpecializedComponent;


/**
 * this class will add extra functionality while having the same interface.
 * A decorator only changes an object’s responsibilities, not its interface; an adapter gives a completely new interface.
 *
 * A decorator can be viewed as a degenerate composite with only one component. However, a decorator adds additional responsibilities.
 */
public class SpecialClassA extends SpecializedComponent {

    public SpecialClassA(Component component, String string) {
        super(component, string);
    }


    @Override
    public void operationA() {
        System.out.println("SpecializedComponent Basic operation A by class A");
    }

    @Override
    public void operationB() {
        System.out.println("SpecializedComponent Basic operation B by class A");
    }

    public void newBehavior() {
        System.out.println("New behavior by class A");
    }
}
