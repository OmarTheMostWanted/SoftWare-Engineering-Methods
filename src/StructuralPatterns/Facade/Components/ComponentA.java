package StructuralPatterns.Facade.Components;

import java.util.Objects;

public class ComponentA {

    private String string;

    public ComponentA(String string) {
        this.string = string;
    }

    public void ComplexStuff(){
        System.out.println("Doing component A stuff");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComponentA)) return false;
        ComponentA that = (ComponentA) o;
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
