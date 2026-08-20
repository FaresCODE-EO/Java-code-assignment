package Day3;

import java.util.Random;

public class LotteryTicket {
    public static void main(String[] args) {
        int[] ticket = generateTicketNumber();
        printTicket(ticket);
    }

    public static int[] generateTicketNumber() {
        int[] ticket = new int[6];
        Random random = new Random();
        for (int i = 0; i < ticket.length; i++) {
            ticket[i] = random.nextInt(69) + 1;
        }
        return ticket;
    }

    public static void printTicket(int[] ticket) {
        for (int i = 0; i < 6; i++) {
            System.out.println(ticket[i] + " | ");
        }
    }
}