import java.util.Scanner;

class Car {
    int modelyear;
    int mileage;
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car C1 = new Car();
        Car C2 = new Car();

        System.out.println("Enter model year of Car C1:");
        C1.modelyear = sc.nextInt();
        System.out.println("Enter mileage of Car C1:");
        C1.mileage = sc.nextInt();
        System.out.println("Enter model year of Car C2:");
        C2.modelyear = sc.nextInt();
        System.out.println("Enter mileage of Car C2:");
        C2.mileage = sc.nextInt();
        
        System.out.println("\nCar C1 Details:");
        System.out.println("Model Year: " + C1.modelyear);
        System.out.println("Mileage: " + C1.mileage);
        System.out.println("\nCar C2 Details:");
        System.out.println("Model year: " + C2.modelyear);
        System.out.println("Mileage: " + C2.mileage);

        sc.close();
    }
}
