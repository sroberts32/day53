package day53.Counters.src;

public class Counter {
    private int counter;

    public Counter() {
        this.counter = 0;
    }

    public Counter(int StartValue) {
        this.counter = StartValue;
    }

    public int value() {
        return counter;
    }

    public void increase() {
        counter += 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            counter += increaseBy;
        }
    }

    public void decrease() {
        counter -= 1;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            counter -= decreaseBy;
        }
    }

}
