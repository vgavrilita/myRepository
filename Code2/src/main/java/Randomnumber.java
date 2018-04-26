import java.util.Random;

public class Randomnumber {

    public int getNmber() {

        Random rand = new Random();
        int value = rand.nextInt(50) + 1;

        return value;
    }
}
