public class Main {

    public static int generateSimulation(int rounds) {
        // Simulation goes here
        System.out.println(rounds); 
        return 0;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            // Show Stat
            System.out.println("Stat..."); 
        }
        else {
            // Start simulation
            int num = Integer.parseInt(args[0]);
            generateSimulation(num);         
        }
    }
}
