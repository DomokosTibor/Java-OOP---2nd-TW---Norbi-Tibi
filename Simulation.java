import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;


public class Simulation extends Simulator {
    private Result result;

    public Simulation() {

    }
    
    public static void generateData(String filename, String roundData) {
        File x = new File(filename);
        if (x.exists()) {
            try {
                FileWriter fstream = new FileWriter(filename,true);
                BufferedWriter fbw = new BufferedWriter(fstream);
                fbw.write(roundData);
                fbw.newLine();
                fbw.close();
            }
            catch (Exception e) {
                System.out.println("ERROR!!");
            }
        }
        else {
            try {
                Formatter g = new Formatter(filename);
                g.format(roundData + "\n");
                g.close();
            }
            catch (Exception e) {
                System.out.println("SIMULATION ERROR");
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
        System.out.println("done!");
*/
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Result getResult() {
        return result;
    }
}