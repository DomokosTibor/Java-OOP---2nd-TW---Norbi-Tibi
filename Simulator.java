import java.util.Random;

public class Simulator extends Simulation implements Logger{
    
    Random rand = new Random();


    public Simulator() {

    }

    public int run() {
        int counter = 0;
        Random rand = new Random();
        if (counter % 15 != 0) {
            int n = rand.nextInt(37);
            return n;
        } else if(counter % 15 == 0) {
            return 0;
        }
        counter++;
    }
}