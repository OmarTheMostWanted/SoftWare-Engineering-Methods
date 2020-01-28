package StructuralPatterns.Facade;

import StructuralPatterns.Facade.Components.ComponentA;
import StructuralPatterns.Facade.Components.ComponentB;

import java.util.Objects;


/**
 * this is a complex class that is composed from other classes.
 * Working with this class directly requires know all the subcomponents.
 */
public class ComplexAPI {

    private ComponentA componentA;

    private ComponentB componentB;

    public ComplexAPI(ComponentA componentA, ComponentB componentB) {
        this.componentA = componentA;
        this.componentB = componentB;
    }

    public ComplexAPI() {
        componentA = new ComponentA("A");
        componentB = new ComponentB("B");
    }

    public void doComplexAPIStuff(){
        System.out.println("Complex API function");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComplexAPI)) return false;
        ComplexAPI that = (ComplexAPI) o;
        return Objects.equals(componentA, that.componentA) &&
                Objects.equals(componentB, that.componentB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentA, componentB);
    }

    public ComponentA getComponentA() {
        return componentA;
    }

    public void setComponentA(ComponentA componentA) {
        this.componentA = componentA;
    }

    public ComponentB getComponentB() {
        return componentB;
    }

    public void setComponentB(ComponentB componentB) {
        this.componentB = componentB;
    }
}
