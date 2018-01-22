import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Simulation {
    

    public Simulation() {

    }

    public int generateData() {
        return 0;
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