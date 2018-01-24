import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Simulator /*extends Simulation implements Logger*/{
    
    
/*

    public Simulator() {
        private Simulation simulation;
        private Logger logger;
        
    
        Simulator(Simulation simulation, Logger logger) {
            this.simulation = simulation;
            this.logger = logger;
        }
    }
*/
    public static String run() {
        
        Random rand = new Random();
        int n = rand.nextInt(37);
        String roundData = "1";

        String fileName = "table.csv";
        File f = new File(fileName);
        if (f.exists()) {
            try {
                File x = new File(fileName);
                Scanner sc = new Scanner(x);
                int counter = 0;
                while (sc.hasNext()) {
                    String logLine = sc.next();
                    if (counter == n) {
                        roundData = logLine;
                    }
                    counter++;
                }
                sc.close();
                return roundData;

            }
            catch(FileNotFoundException e) {
                System.out.println("SIMULATOR ERROR");
                return "2";
            }
        }
        else {
            System.out.println("ERROR: Table file is missing!");
            return "3";
        }

    }
}