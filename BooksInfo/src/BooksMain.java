package day53.BooksInfo.src;

import java.util.ArrayList;
import java.util.Scanner;

public class BooksMain {
    public static void main(String[] args) throws Exception {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Book book1 = new Book("Ready Player One", 374, 2011);
        books.add(book1);
        books.add(new Book("Dark Force Rising", 480, 1992));
        books.add(new Book("Blood of Elves", 320, 1994));

        //part 2
        books.add(new Book("Armada"));
        books.add(new Book(634));
        books.add(new Book("Count of Monte Cristo", 1884));

        while (true) {
            System.out.println("What would you like to print?");
            System.out.println("Options: Everything, title, exit");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("exit")) {
                break;
            } else if (response.equalsIgnoreCase("everything")) {
                for (Book book : books) {
                    System.out.println(book);
                }
            } else if (response.equalsIgnoreCase("title")) {
                for (int i = 0; i < books.size(); i++) {
                    System.out.println(books.get(i).getTitle());
                }

            }

        }
        scanner.close();
    }

}
