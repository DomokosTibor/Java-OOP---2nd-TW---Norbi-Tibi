public class Main {

    public static void generateSimulation(int round) {
/*       
        Simulation simulation = new Simulation(round);
        Simulator simulator = new Simulator(simulation, new Logger(round, simulationNumber));
        simulation.setRoundResult(simulator.run());
*/        
        System.out.println("Adding " + round + " simulation(s) into the LOG file:");
        int progress = 0;
        for (double i = 0; i < round; i++) {
            Simulation.generateData("log.csv", Simulator.run());
            if (i / round == 0) System.out.print("0% ");
            else if (i / round >= 0.1 && progress < 10 && round >= 10) {System.out.print("... 10% "); progress = 11;}
            else if (i / round >= 0.2 && progress < 20 && round >= 10) {System.out.print("... 20% "); progress = 21;}
            else if (i / round >= 0.3 && progress < 30 && round >= 10) {System.out.print("... 30% "); progress = 31;}
            else if (i / round >= 0.4 && progress < 40 && round >= 10) {System.out.print("... 40% "); progress = 41;}
            else if (i / round >= 0.5 && progress < 50 && round >= 10) {System.out.print("... 50% "); progress = 51;}
            else if (i / round >= 0.6 && progress < 60 && round >= 10) {System.out.print("... 60% "); progress = 61;}
            else if (i / round >= 0.7 && progress < 70 && round >= 10) {System.out.print("... 70% "); progress = 71;}
            else if (i / round >= 0.8 && progress < 80 && round >= 10) {System.out.print("... 80% "); progress = 81;}
            else if (i / round >= 0.9 && progress < 90 && round >= 10) {System.out.print("... 90% "); progress = 91;}
        }
        System.out.println("... 100%\nDone!");


//        return simulation;

    }

    public static void main(String[] args) {
        if (args.length < 1) {
            // Show Stat
            Statistics.getStat();
        }
        else {
            // Start simulation
            int simulationNumber = Integer.parseInt(args[0]);
            int maxSimulationNumber = 1000000;

            if (simulationNumber > maxSimulationNumber || simulationNumber < 1) {
                System.out.println("Number of simulations cannot be lower than 1 and bigger than " + maxSimulationNumber);
                System.exit(-1);
            }
/*
            Simulation[] simulations = new Simulation[simulationNumber];
            for (int i = 0; i < simulationNumber; i++) {
                simulations[i] = generateSimulation(i);
            }
*/
            generateSimulation(simulationNumber);
            
        }
    }
}
