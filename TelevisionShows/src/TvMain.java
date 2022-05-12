package day53.TelevisionShows.src;

import java.util.ArrayList;
import java.util.Scanner;

public class TvMain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> tvShows = new ArrayList<>();


        //part 2
        tvShows.add(new TvShow("Futurama"));
        tvShows.add(new TvShow(24));
        tvShows.add(new TvShow("Archer", 93));
        tvShows.add(new TvShow("Family Guy", "Comedy"));
        

        System.out.println("Entering nothing will stop the loop.");

        while (true) {
            System.out.println("Please enter TV Show: ");
            String showName = scanner.nextLine();

            if (showName.equals("")) {
                break;
            }

            System.out.println("How many episodes?");
            int numOfEp = Integer.valueOf(scanner.nextLine());

            System.out.println("What is the genre?");
            String showGenre = scanner.nextLine();

            tvShows.add(new TvShow(showName, numOfEp, showGenre));
        }

        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }

        scanner.close();
    }

}