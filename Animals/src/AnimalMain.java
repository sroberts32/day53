package day53.Animals.src;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        boolean typeDog;

        System.out.println("Entering nothing will stop the loop.");

        while (true) {
            System.out.println("Please enter a name: ");
            String animalName = scanner.nextLine();

            if (animalName.equals("")) {
                break;
            }
            
            System.out.println("Is it a dog? y or n.");
            String isDog = scanner.nextLine();

                if (isDog.equalsIgnoreCase("y")) {
                    typeDog = true;
                } else {
                    typeDog = false;
                }

            
            animals.add(new Animal(animalName, typeDog));
        }

        for (Animal animal : animals ) {
            System.out.println(animal);
        }

        scanner.close();
    }
    
}
