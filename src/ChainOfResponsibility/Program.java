package ChainOfResponsibility;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is the chain of command design pattern " +
                "\n Press A , B , B for orders or press anything else to close");
        loop:
        while (true) {
            String input =  scanner.next();

            switch (input) {
                case "A":
                    client.makeRequest(Order.OrderA);
                    continue loop;
                case "B":
                    client.makeRequest(Order.OrderB);
                    continue loop;

                case "C":
                    client.makeRequest(Order.OrderC);
                    continue loop;

                default:
                    break loop;
            }

        }
        System.out.println("Program closed");
        scanner.close();
    }
}

