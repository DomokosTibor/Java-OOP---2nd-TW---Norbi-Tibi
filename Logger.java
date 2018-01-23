import java.util.Date;

public class Logger {

    public void log(String type, String message){
        Date now = new Date();
        now.getTime();
        System.out.format("%s %s %s\n", now, type, message);
    }

    public Logger(int rounds, int simulationNumber) {
        System.out.println(rounds + "/" + simulationNumber + " >> ");
    }

}
