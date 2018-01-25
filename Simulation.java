import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;


public class Simulation {//extends Simulator {
    private Result result;
    public int round;

    public Simulation(int round) {
        this.round = round;
    }
    
    public static void generateData(String filename, Result roundData) {
        File x = new File(filename);
        if (x.exists()) {
            try {
                FileWriter fstream = new FileWriter(filename,true);
                BufferedWriter fbw = new BufferedWriter(fstream);
                fbw.write(roundData.result);
                fbw.newLine();
                fbw.close();

            }
            catch (Exception e) {
                Logger.displayMessage("ERROR!!");
            }
        }
        else {
            try {
                Formatter g = new Formatter(filename);
                g.format(roundData + "\n");
                g.close();
            }
            catch (Exception e) {
                Logger.displayMessage("SIMULATION ERROR");
            }
        }
    }
 
    public void load(){
 /*
        PrintWriter pw = new PrintWriter(new File("data.csv"));
        StringBuilder sb = new StringBuilder();
        sb.append("number");
        
        pw.write(sb.toString());
        pw.close();
        Logger.displayMessage("done!");
*/
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Result getResult() {
        return result;
    }
}