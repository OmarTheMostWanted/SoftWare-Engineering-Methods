package StructuralPatterns.Composite;

import StructuralPatterns.Composite.CompositeClass;
import StructuralPatterns.Composite.CompositeClassComponent;

/**
 * this client will make use of the Composite class and its components.
 */
public class Client {

    public static void main(String[] args) {
        CompositeClass compositeClass = new CompositeClass();

        //its easy to iterate over all the sub components now.
        for(CompositeClassComponent compositeClassComponent: compositeClass.getComponents()){
            compositeClassComponent.function1();
        }

        System.out.println("===================================");

        compositeClass.getComponents().get(0).function2();

    }
}
