package StructuralPatterns.Facade.Components;

import java.util.Objects;

public class ComponentB {

    private String string;

    public ComponentB(String string) {
        this.string = string;
    }

    public void ComplexStuff(){
        System.out.println("Doing component B stuff");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComponentB)) return false;
        ComponentB that = (ComponentB) o;
        return Objects.equals(string, that.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
