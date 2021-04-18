package sec04.expressions_statements_blocks_methods;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);       // 2500 KB = 2 MB and 452 KB
        printMegaBytesAndKiloBytes(-1024);      // Invalid Value
        printMegaBytesAndKiloBytes(5000);       // 5000 KB = 4 MB and 904 KB
        printMegaBytesAndKiloBytes(0);          // 0 KB = 0 MB and 0 KB
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int newKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + newKiloBytes + " KB");
        }
    }
}
