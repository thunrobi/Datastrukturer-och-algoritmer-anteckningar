import java.util.Random;

public class RandomNum {

    Random random = new Random();
    public int number;

    public RandomNum (){
        this.number = random.nextInt(1,100);
    }
    public int getNumber(){
        return number;
    }
}

