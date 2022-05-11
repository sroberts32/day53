package day53.Lesson.src;

public class Customer {
    private String name;
    private int age;

    // the class constructor
    public Customer(String customerName) {
        this.age = 0;
        this.name = customerName;
    }

    //2nd class constructor (overloading) to add 2nd parameter
    public Customer(String customerName, int age) {
        this.age = age;
        this.name = customerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //way to print objects
    @Override
    public String toString() {
        return "The customer's name is " + this.name + " and their age is " + this.age;
    }
    // standard print method
    // public void printCustomer() {
    //     System.out.println("The customer's name is " + this.name + " and their age is " + this.age);
    // }

    public String frequentCustomer() {
        return "frequent";
    }

    public String nonFrequentCustomer() {
        return "non-frequent";
    }
}
