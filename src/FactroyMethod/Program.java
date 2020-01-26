package FactroyMethod;

import FactroyMethod.ConcreteCreators.CreatorA;
import FactroyMethod.ConcreteCreators.CreatorB;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    private static ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        CreatorA creatorA = new CreatorA();
        CreatorB creatorB = new CreatorB();


        Factoy factoy;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select what creator you need A, B \n" +
                "or Pres Q to exit");

        outerLoop:
        while (true) {

            if (scanner.next().equals("S")) {
                for (Product product : products) {
                    System.out.println(product.getString());
                }
            } else if (scanner.next().equals("A")) {
                System.out.println("Creator A: select object you want to create A ,B ,C \n" +
                        "or press E to select creator or Q to exit");
                innerLoop:
                while (true) {
                    switch (scanner.next()) {

                        case ("A"):
                            products.add(creatorA.factoryMethod(Type.ProductA));
                            continue innerLoop;
                        case ("B"):
                            products.add(creatorA.factoryMethod(Type.ProductB));
                            continue innerLoop;
                        case ("C"):
                            products.add(creatorA.factoryMethod(Type.ProductC));
                            continue innerLoop;
                        case ("E"):
                            System.out.println("Select what creator you need A, B \n" +
                                    "or Pres Q to exit");
                            continue outerLoop;
                        case ("Q"):
                            System.out.println("Program closed");
                            scanner.close();
                            break outerLoop;

                        default:
                            System.err.println("Wrong Type");
                    }
                }
            } else if (scanner.next().equals("B")) {
                System.out.println("Creator B: select object you want to create A ,B ,C \n" +
                        "or press E to select creator or Q to exit");
                innerLoop:
                while (true) {

                    switch (scanner.next()) {
                        case ("A"):
                            products.add(creatorB.factoryMethod(Type.ProductA));
                            continue innerLoop;
                        case ("B"):
                            products.add(creatorB.factoryMethod(Type.ProductB));
                            continue innerLoop;
                        case ("C"):
                            products.add(creatorB.factoryMethod(Type.ProductC));
                            continue innerLoop;
                        case ("E"):
                            System.out.println("Select what creator you need A, B \n" +
                                    "or Pres Q to exit");
                            continue outerLoop;
                        case ("Q"):
                            System.out.println("Program closed");
                            scanner.close();
                            break outerLoop;

                        default:
                            System.err.println("Wrong Type");

                    }
                }
            } else if (scanner.next().equals("Q")) {
                System.out.println("Program closed");
                scanner.close();
                break;
            } else {
                System.err.println("Wrong Factory");
            }

        }
    }
}
