public class Main {

    public static Simulation generateSimulation(int round) {
       
        Simulation simulation = new Simulation(round);
        //Simulator simulator = new Simulator(simulation, new Logger(round, simulationNumber));
        
       
        Logger.displayMessage("Adding " + round + " simulation(s) into the LOG file:");
        int progress = 0;
        for (double i = 0; i < round; i++) {
            Simulation.generateData("log.csv", Simulator.run());
            if (i / round == 0) Logger.displayMessageNoLN("0% ");
            else if (i / round >= 0.1 && progress < 10 && round >= 10) {Logger.displayMessageNoLN("... 10% "); progress = 11;}
            else if (i / round >= 0.2 && progress < 20 && round >= 10) {Logger.displayMessageNoLN("... 20% "); progress = 21;}
            else if (i / round >= 0.3 && progress < 30 && round >= 10) {Logger.displayMessageNoLN("... 30% "); progress = 31;}
            else if (i / round >= 0.4 && progress < 40 && round >= 10) {Logger.displayMessageNoLN("... 40% "); progress = 41;}
            else if (i / round >= 0.5 && progress < 50 && round >= 10) {Logger.displayMessageNoLN("... 50% "); progress = 51;}
            else if (i / round >= 0.6 && progress < 60 && round >= 10) {Logger.displayMessageNoLN("... 60% "); progress = 61;}
            else if (i / round >= 0.7 && progress < 70 && round >= 10) {Logger.displayMessageNoLN("... 70% "); progress = 71;}
            else if (i / round >= 0.8 && progress < 80 && round >= 10) {Logger.displayMessageNoLN("... 80% "); progress = 81;}
            else if (i / round >= 0.9 && progress < 90 && round >= 10) {Logger.displayMessageNoLN("... 90% "); progress = 91;}
        }
        Logger.displayMessage("... 100%\nDone!");

        return simulation;

    }

    public static void main(String[] args) {
        if (args.length < 1) {
            Statistics.getStat();
        }
        else {
            int maxSimulationNumber = 1000000;
            try {
                int simulationNumber = Integer.parseInt(args[0]);
                if (simulationNumber > maxSimulationNumber || simulationNumber < 1) {
                    Logger.displayMessage("Number of simulations cannot be lower than 1 and bigger than " + maxSimulationNumber);
                    System.exit(-1);
                }
                generateSimulation(simulationNumber);
            }
            catch(NumberFormatException e) {
                Logger.displayMessage("The number of simulation has to be a NUMBER between 1 and " + maxSimulationNumber + "!");
            }
            
        }
    }
}
