public class Person {

    String name;
    int rank;

    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }
    public int getRank(){
        return rank;
    }

}
