import java.util.Date;

public class Logger {

    public Logger() {

    }

    public void log(String type, String message){
        Date now = new Date();
        now.getTime();
        System.out.format("%s %s %s\n", now, type, message);
    }

    public Logger(int round, int simulationNumber) {
        //System.out.println(round + "/" + simulationNumber + " >> ");
    }

    public static void displayMessage(String message) {
        System.out.println(message);
    }

    public static void displayMessageNoLN(String message) {
        System.out.print(message);
    }
}
