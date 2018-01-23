import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Formatter;


public class Simulation {
    

    public Simulation() {

    }
    
    public static void generateData(String filename, String roundData) {
        File x = new File(filename);
        if (x.exists()) {
            /* DEL ME */
            System.out.println(x.getName() + " exists!\nAppending to File...");
            /* DEL ME */
            try {
                FileWriter fstream = new FileWriter(filename,true);
                BufferedWriter fbw = new BufferedWriter(fstream);
                fbw.write(roundData);
                fbw.newLine();
                fbw.close();
            }
            catch (Exception e) {
                System.out.println("ERROR");
            }
        }
        else {
            /* DEL ME */
            System.out.println(x.getName() + " NOT exists!\nCreating File...");
            /* DEL ME */
            try {
                Formatter f = new Formatter(filename);
                f.format(roundData + "\n");
                f.close();
            }
            catch (Exception e) {
                System.out.println("ERROR");
            }
        }
    }
 
    public void load(){
        PrintWriter pw = new PrintWriter(new File("data.csv"));
        StringBuilder sb = new StringBuilder();
        sb.append("number");
        
        pw.write(sb.toString());
        pw.close();
        System.out.println("done!");
    }
}