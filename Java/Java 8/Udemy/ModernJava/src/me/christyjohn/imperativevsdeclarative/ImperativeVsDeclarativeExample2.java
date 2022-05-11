package me.christyjohn.imperativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 4, 7, 7, 9, 8, 6, 6);

        // Remove duplicates from the list
        /*
            Imperative style
         */
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer i : integerList) {
            if (!uniqueList.contains(i))
                uniqueList.add(i);
        }
        System.out.println("Unique List : " + uniqueList );

        /*
            Declarative style
         */
        List<Integer> uniqueList1 = integerList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique List 1 : " + uniqueList1);
    }
}
