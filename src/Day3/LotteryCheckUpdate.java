package Day3;

import java.util.Arrays;
import java.util.Random;

public class LotteryCheckUpdate {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateTicketNumber();
        printTicket(ticket);
    }

    public static int[] generateTicketNumber() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < ticket.length; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    public static boolean search(int[] array, int numberToSearchFor) {
        for (int value : array) {
            if (value == numberToSearchFor) {
                return true;
            }
        }
        return false;
    }

    public static void printTicket(int[] ticket) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }
    public static boolean binarySearch(int[] array, int numberToSearch) {
        int[] sorted = array.clone();
        Arrays.sort(sorted);
        int index = Arrays.binarySearch(sorted, numberToSearch);
        if (index >= 0) {
            return true;
        } else {
            return false;
        }
    }
}