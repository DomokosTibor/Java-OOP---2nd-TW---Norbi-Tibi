import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Simulator /*extends Simulation implements Logger*/{
    public Simulation simulation;
    public Logger logger;
    
    


    
        Simulator(Simulation simulation, Logger logger) {
            this.simulation = simulation;
            this.logger = logger;
        }
    
    public static Result run() {
        
        Random rand = new Random();
        int n = rand.nextInt(37);
        Result roundData = new Result("Error");

        String fileName = "table.csv";
        File f = new File(fileName);
        if (f.exists()) {
            try {
                File x = new File(fileName);
                Scanner sc = new Scanner(x);
                int counter = 0;
                String logLine;
                while (sc.hasNext()) {
                    logLine = sc.next();
                    Result loglineResult = new Result(logLine);
                    if (counter == n) {
                        roundData = loglineResult;
                    }
                    counter++;
                }
                sc.close();
                return roundData;

            }
            catch(FileNotFoundException e) {
                Logger.displayMessage("SIMULATOR ERROR");
                return roundData;
            }
        }
        else {
            Logger.displayMessage("ERROR: Table file is missing!");
            return roundData;
        }

    }
}