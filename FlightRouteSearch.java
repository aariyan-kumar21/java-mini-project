import java.util.Scanner;

public class FlightRouteSearch {
    public static void main(String[] args) {
        // 1. Data: {Airline, From, To, Price}
        String[][] flights = {
            {"Air India", "Mumbai", "Delhi", "4500"},
            {"Indigo", "Bangalore", "Chennai", "3200"},
            {"Vistara", "Mumbai", "bangalore", "5000"},
            {"Air India", "Delhi", "Bangalore", "6500"},
            {"SpiceJet", "Delhi", "Mumbai", "4200"}
        };

        Scanner scanner = new Scanner(System.in);

        // 2. User Input
        System.out.println("--- Flight Route Search ---");
        System.out.print("Enter Departure City: ");
        String source = scanner.nextLine();
        
        System.out.print("Enter Destination City: ");
        String destination = scanner.nextLine();

        System.out.println("\nSearching for flights from " + source + " to " + destination + "...");
        boolean found = false;

        // 3. Logic: Loop and compare Strings
        for (int i = 0; i < flights.length; i++) {
            // .equalsIgnoreCase makes "mumbai" match "Mumbai"
            if (flights[i][1].equalsIgnoreCase(source) && flights[i][2].equalsIgnoreCase(destination)) {
                System.out.println(flights[i][0] + " | Ticket Price: Rs." + flights[i][3]);
                found = true;
            }
        }

        if (!found) {
            System.out.println(" No flights found for this specific route.");
        }
      scanner.close();
   
    }
}