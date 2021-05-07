package sec12.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully.");
        }

        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));


        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "this course is about Java");
            System.out.println("java added successfully.");
        }

        printMap(languages);

        languages.remove("Algol");

        if( languages.remove("BASIC", "Beginners All Purpose Symbolic Instruction Code")) {
            System.out.println("BASIC removed");
        } else {
            System.out.println("BASIC not removed. key/ value pair not found.");
        }

        printMap(languages);

       if (languages.replace("Lisp","Therein lies madness", "a functional programming language with imperative features")) {
           System.out.println("Lisp replaced.");
       } else {
           System.out.println("Lisp not replaced");
       }

        System.out.println(languages.replace("Scala", "this will not be added"));

        printMap(languages);

    }

    public static void printMap(Map<String, String> map) {
        System.out.println("====================================================");
        for (String key : map.keySet()) {
            System.out.println(key + " : "+ map.get(key));
        }
    }
}
