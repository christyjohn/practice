package sec12.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheatreApp {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);

        // copy the seats
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        // demonstrate that the above was a shallow copy
        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved.");
        }
        System.out.println("==========================");

        Collections.reverse(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theatre.seats");
        printList(theatre.seats);
        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is: " + minSeat.getSeatNumber());
        System.out.println("Max seat number is: " + maxSeat.getSeatNumber());

        System.out.println("==========================");

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);

    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==========================");
    }

    // Bubble Sort
    public static void sortList(List<? extends Theatre.Seat> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for ( int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
