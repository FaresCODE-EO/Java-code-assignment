package Day2;
import java.util.Scanner;
public class Greeting {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas Enter Your name: ");
        String name = scanner.nextLine();
        greetingUser(name);

    }
    static void greetingUser(String name){
        System.out.println("Hello "+name);
    }
}
