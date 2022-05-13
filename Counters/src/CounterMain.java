package day53.Counters.src;

public class CounterMain {
    public static void main(String[] args) throws Exception {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(10);

        //automatic
        System.out.println("Counter at 0");
        System.out.println(counter1.value());

        System.out.println("Increment");
        counter1.increase();
        System.out.println(counter1.value());

        System.out.println("Decrement");
        counter1.decrease();
        System.out.println(counter1.value());

        //With the overloaded constructors and getters
        System.out.println("Counter at 10");
        System.out.println(counter2.value());

        System.out.println("Increment");
        counter2.increase(5);
        System.out.println(counter2.value());

        System.out.println("Decrement");
        counter2.decrease(4);
        System.out.println(counter2.value());

    }
}
