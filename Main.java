public class Main {

    public static Simulation generateSimulation(int round) {
        Simulation simulation = new Simulation(round);
        Simulator simulator = new Simulator(simulation, new Logger(round, simulationNumber));
        simulation.setRoundResult(simulator.run());
        simulation.generateData("log.csv");
        return simulation;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            // Show Stat
            Statistics.getStat();
        }
        else {
            // Start simulation
            int simulationNumber = Integer.parseInt(args[0]);
            int maxSimulationNumber = 1000;

            if (simulationNumber > maxSimulationNumber || simulationNumber < 1) {
                System.out.println("Number of simulations cannot be lower than 1 and bigger than " + maxSimulationNumber);
                System.exit(-1);
            }

            Simulation[] simulations = new Simulation[simulationNumber];
            for (int i = 0; i < simulationNumber; i++) {
                simulations[i] = generateSimulation(i);
            }


            
        }
    }
}
