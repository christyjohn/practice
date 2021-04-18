package sec04.expressions_statements_blocks_methods;

public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));        // 1
        System.out.println(toMilesPerHour(10.25));      // 6
        System.out.println(toMilesPerHour(-5.6));       // -1
        System.out.println(toMilesPerHour(25.42));      // 16
        System.out.println(toMilesPerHour(75.114));     // 47

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long milesPerHour = 0;

        if (kilometersPerHour < 0) {
            milesPerHour = -1;
        } else {
            milesPerHour = Math.round(kilometersPerHour / 1.609);
        }

        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (milesPerHour == -1)
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}
