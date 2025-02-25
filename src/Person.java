import java.util.Random;

public class Person implements Comparable<Person> {

    String name;
    int rank;
    int money;


    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int rank) {
        this.name = name;
        this.rank = rank;
        this.money = (new Random().nextInt(200));
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public int compareTo(Person person) {
        return person.getMoney() - money;
        // return name.compareTo(person.getName());
    }

    private int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return name + " (" + money + ")";
    }
}