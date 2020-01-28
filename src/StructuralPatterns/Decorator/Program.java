package StructuralPatterns.Decorator;

import StructuralPatterns.Decorator.SpecializedComponets.SpecialClassA;

public class Program {

    public static void main(String[] args) {
        BasicComponent basicComponent = new BasicComponent();

        basicComponent.operationA();

        SpecialClassA specialClass = new SpecialClassA(basicComponent, "A");

        specialClass.newBehavior();

        specialClass.operationB();

        //hmm Im not sure tho. something is wrong.

        //TODO
    }
}
