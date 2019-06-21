import java.util.Scanner;
import java.lang.*;

public class Impedence extends Volume {


    public static void main (String [] args) {

        Volume take = new Volume();

        Scanner input = new Scanner(System.in);
        double r;
        double z;
        double Xl;
        double Xc;

        System.out.println("Enter the value for resistance: ");
        r = input.nextDouble();

        System.out.println("Enter the value for inductance: ");
        Xl = take.getInductance();

        System.out.println("Enter the value for capacitance: ");
        Xc = take.getCapacitance();

        z = Math.sqrt(Math.pow(r, 2) + Math.pow((Xl - Xc), 2));
        System.out.println("Impedence = " +z);
        return;
    }

}