import java.util.Date;

public class Logger {

    public void log(String type, String message){
        Date now = new Date();
        now.getTime();
        System.out.format("%s %s %s\n", now, type, message);
    }

    public Logger(int round, int simulationNumber) {
        System.out.println(rounds + "/" + simulationNumber + " >> ");
    }

    public displayMessage(String message) {
        System.out.println(message);
    }

}
