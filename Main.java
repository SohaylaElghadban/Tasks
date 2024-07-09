package Vechile;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter vehicle type (truck/car): ");
        String vehicleType = scanner.nextLine();
        System.out.print("Enter weight load: ");
        int weightLoad = scanner.nextInt();

        Vechile v;
        if ("truck".equalsIgnoreCase(vehicleType)) {
            v= new Truck(weightLoad);
        } else if ("car".equalsIgnoreCase(vehicleType)) {
            v = new Car(weightLoad);
        } else {
            System.out.println("Invalid vehicle type!");
            scanner.close();
            return;
        }

        System.out.println("The weight load is: " + v.getVehicleWeightLoad());

        scanner.close();
    }
}