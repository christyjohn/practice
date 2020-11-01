package sec04.expressions_statements;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = 0;

        if (kiloBytes < 0)
            System.out.println("Invalid Value");
        else {
            megaBytes = kiloBytes / 1024;
            System.out.print(kiloBytes + " KB = " + megaBytes + " MB and ");
            kiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB");
        }
    }
}
