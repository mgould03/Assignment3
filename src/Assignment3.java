import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to metric converter!");
        System.out.println("Please choose a conversion type:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Meters to Feet");
        System.out.println("3. Celsius to Farenheit");
        System.out.println("4. Kilogram to Pound");
        System.out.println("Or input '0' to close the program.");
    
        int choice = scanner.nextInt();
        while (choice > 4 && choice < 0) {
           System.out.println("Not a choice, please try again.");
           choice =scanner.nextInt(); 
        }

      switch (choice) {
        case 1:
            System.out.println("Enter kilometers:");
            double kilom = scanner.nextDouble();
            double mi = kilom * 0.621371;
            System.out.println(kilom + "km is equal to " + mi + "mi");
            break;
        case 2:
            System.out.println("Enter meters:");
            double met = scanner.nextDouble();
            double ft = met * 3.28084;
            System.out.println(met + "m is equal to " + ft + "ft");
            break;
        case 3:
            System.out.println("Enter celsius:");
            double cel = scanner.nextDouble();
            double far = (1.8 * cel) + 32;
            System.out.println(cel + " celsius is equal to " + far + "farenheit");
            break; 
        case 4:
            System.out.println("Enter kilograms:");
            double kilog = scanner.nextDouble();
            double lbs = kilog * 2.2046;
            System.out.println(kilog + "kg is equal to " + lbs + "lbs");
            break;
        case 0:
            System.exit(0); 
            break;
        }  
      scanner.close();
    }
}
