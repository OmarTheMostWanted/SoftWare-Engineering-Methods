package FactoryMethod;

import FactoryMethod.ConcreteFactories.FactoryA;
import FactoryMethod.ConcreteFactories.FactoryB;
import FactoryMethod.ConcreteFactories.FactoryC;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    private static ArrayList<Product> products;

    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        FactoryB factoryB = new FactoryB();
        FactoryC factoryC = new FactoryC();

        products = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the Type of object you want to create A, B, C \n" +
                "Type S to show created objects or Q to exit");

        loop:
        while (true) {

            String input = scanner.next();

            switch (input) {
                case "A":
                    doStuff(factoryA.factoryMethod());
                    continue loop;
                case "B":
                    doStuff(factoryB.factoryMethod());
                    continue loop;

                case "C":
                    doStuff(factoryC.factoryMethod());
                    continue loop;

                case "S":

                    if (products.isEmpty()) {
                        System.out.println("No products yet");
                    } else {
                        for (Product product : products) {
                            System.out.println(product.getString());
                        }
                    }
                    continue loop;

                case "Q":
                    break loop;

                default:
                    System.out.println("Wrong input");
            }
        }

        System.out.println("Program closed");
        scanner.close();

    }

    private static void doStuff(Product product) {
        product.function();
        products.add(product);
    }

}
