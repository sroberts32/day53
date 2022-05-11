package day53.Lesson.src;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Customer> customers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // // creating a customer object
        // Customer hector = new Customer("Hector");
        // // adding the customer object to the list
        // customers.add(hector);

        // // person objects can also be created "in the same sentence" that they are
        // added to the list
        // customers.add(new Customer("Larry"));
        // customers.add(new Customer("Mary"));

        // for (Customer customer: customers) {
        // System.out.println(customer);

        // }

        while (true) {
            System.out.print("Enter customer name (enter" + " done " + "to stop entries: ");
            String customerName = scanner.nextLine();

            // continue to add names until "done" is entered
            if (customerName.equals("done")) {
                break;
            }

            // Add customer to the list
            customers.add(new Customer(customerName));
        }

        // for each loop printing each customer's info
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        scanner.close();

    }

}
