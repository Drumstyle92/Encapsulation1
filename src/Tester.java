import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Drumstyle92
 * Class that contains the heart of the program.
 */
public class Tester {
    /**
     * @param args main parameter.
     * Main method that contains a House object,
     * scanner object and various inputs placed by the user
     * with outputs showing the characteristics of the house.
     */
    public static void main(String[] args) {
        // home object creation
        House house;
        house = new House();
        // using the scanner the user enters the characteristics of the house
        Scanner scanner = new Scanner(System.in);

        System.out.println("The building's street is:");
        house.setAddress(scanner.nextLine());
        System.out.println("--------------------------------------------------");
        System.out.println("The number of floors of the condominium is:");
        house.setFloorsNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.println("--------------------------------------------------");
        System.out.println("The names of the residents are:");
        house.setResidentsNames(scanner.nextLine().split(","));
        scanner.close();
        System.out.println("--------------------------------------------------");
        String print = String.format("-Features of the house-\nAddress: %s \nFloors: %d \nResidents: %s",
                house.getAddress(),house.getFloorsNumber(),Arrays.toString(house.getResidentsNames()));
        System.out.println(print);
        System.out.println("-------------------------END-------------------------");


    }
}
