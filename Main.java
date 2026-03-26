import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();

        System.out.println("==================================");
        System.out.println(" Ticket to Ride - Sprint 1 Setup ");
        System.out.println("==================================");
        System.out.println("This prototype only demonstrates game setup.");
        System.out.println();

        int numberOfPlayers = readNumberOfPlayers(scanner);

        // Creating each player with the fixed starting setup for this prototype
        for (int i = 1; i <= numberOfPlayers; i++) {
            players.add(new Player("Player " + i));
        }

        System.out.println();
        System.out.println("Setup complete.");
        System.out.println();

        for (Player player : players) {
            System.out.println(player.getStartingState());
        }

        System.out.println("Press Enter to exit...");
        scanner.nextLine();
        scanner.close();
    }

    private static int readNumberOfPlayers(Scanner scanner) {
        while (true) {
            System.out.print("Enter number of players: ");
            String input = scanner.nextLine();

            try {
                int numberOfPlayers = Integer.parseInt(input);

                if (numberOfPlayers > 0) {
                    return numberOfPlayers;
                }

                System.out.println("Please enter a number greater than 0.");
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a whole number.");
            }
        }
    }

    private static class Player {
        private String name;
        private int trains;
        private int trainCards;
        private int destinationTickets;

        public Player(String name) {
            this.name = name;

            // Every player starts with the same setup for this prototype.
            this.trains = 45;
            this.trainCards = 4;
            this.destinationTickets = 3;
        }

        public String getStartingState() {
            return "Player: " + name + "\n"
                    + "Trains: " + trains + "\n"
                    + "Train Cards: " + trainCards + "\n"
                    + "Destination Tickets: " + destinationTickets + " (auto-kept)\n"
                    + "----------------------------------";
        }
    }
}
