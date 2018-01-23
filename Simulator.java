import java.util.Random;

public class Simulator extends Simulation implements Logger{
    
    


    public Simulator() {
        private Simulation simulation;
        private Logger logger;
        
    
        Simulator(Simulation simulation, Logger logger) {
            this.simulation = simulation;
            this.logger = logger;
    }
    }

    public int run() {
        
        Random rand = new Random();
        int n = rand.nextInt(37);
        return n;

    }
}