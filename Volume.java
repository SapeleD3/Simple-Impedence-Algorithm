import java.util.*;
import java.lang.*;

public class Volume {

    double getInductance () {
        double l;
        double f;
        double Xl;
        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter value of Frequency: ");
        f = myScan.nextDouble();

        System.out.println("Enter value of Inductance: ");
        l = myScan.nextDouble();

        Xl = 2*Math.PI*f*l;
        System.out.println("Xl = " +Xl);

        return Xl;
    }

    double getCapacitance () {
        double c;
        double f;
        double Xc;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value of Frequency: ");
        f = input.nextDouble();

        System.out.println("Enter value of capacitance: ");
        c = input.nextDouble();

        Xc = 1/(2*Math.PI*f*c);
        System.out.println("Xc = " +Xc);

        return Xc;
    }
}