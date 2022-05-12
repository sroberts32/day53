package day53.Animals.src;

public class Animal {
    private String name;
    private boolean dog;
    

    public Animal() {

    }

    public Animal(String AnimalName) {
        this.name = AnimalName;
    }

    public Animal(boolean typeDog) {
        this.dog = typeDog;
    }

    public Animal(String animalName, boolean typeDog) {
        this.name = animalName;
        this.dog = typeDog;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public boolean getType() {
        return dog;
    }
    
    public void setType (boolean dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return this.name + " is a dog = " + this.dog;
    }
}
