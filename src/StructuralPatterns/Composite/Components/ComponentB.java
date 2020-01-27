package StructuralPatterns.Composite.Components;

import StructuralPatterns.Composite.CompositeClassComponent;

import java.util.ArrayList;
import java.util.List;

public class ComponentB extends CompositeClassComponent {

    private List<CompositeClassComponent> childComponents = new ArrayList<>();

    @Override
    public void function1() {
        System.out.println("this is function 1 of subComponent B");
    }

    @Override
    public void function2() {
        System.out.println("this is function 2 of subComponent B");
    }
}
