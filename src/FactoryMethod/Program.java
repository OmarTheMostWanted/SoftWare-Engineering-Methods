package FactoryMethod;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    private static ArrayList<Product> products;

    public static void main(String[] args) {

        SelectFactory selectFactory = new SelectFactory();

        products = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the Type of object you want to create A, B, C \n" +
                "Type S to show created objects or Q to exit");

        loop:
        while (true) {

            String input = scanner.next();

            switch (input) {
                case "A":
                    doStuff(selectFactory.createProduct(Type.ProductA));
                    continue loop;
                case "B":
                    doStuff(selectFactory.createProduct(Type.ProductB));
                    continue loop;

                case "C":
                    doStuff(selectFactory.createProduct(Type.ProductC));
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
                    System.err.println("Wrong input");
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
