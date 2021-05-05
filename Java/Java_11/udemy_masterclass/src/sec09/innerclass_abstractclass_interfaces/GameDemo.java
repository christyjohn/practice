package sec09.innerclass_abstractclass_interfaces;

import java.util.ArrayList;
import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {
        Player christy = new Player("Christy", 10, 15);
        System.out.println(christy.toString());

        christy.setHitPoints(8);
        System.out.println(christy);
        christy.setWeapon("Stormbringer");
        saveObject(christy);
        //loadObject(christy);
        System.out.println(christy);

        Saveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values  = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(Saveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject(Saveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
