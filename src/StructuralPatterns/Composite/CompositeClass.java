package StructuralPatterns.Composite;

import StructuralPatterns.Composite.Components.ComponentB;
import StructuralPatterns.Composite.Components.ComponentC;
import StructuralPatterns.Composite.Components.ComponentA;

import java.util.ArrayList;

public class CompositeClass {


    //we know that all the components elements the same basic functions.
    private ArrayList<CompositeClassComponent> components;

    public CompositeClass() {
        components = new ArrayList<>();
        buildComponentTree();
    }

    private void buildComponentTree() {
        this.components.add(new ComponentA());
        this.components.add(new ComponentB());
        this.components.add(new ComponentC());

    }

    public ArrayList<CompositeClassComponent> getComponents() {
        return components;
    }

    public void setComponents(ArrayList<CompositeClassComponent> components) {
        this.components = components;
    }


}
