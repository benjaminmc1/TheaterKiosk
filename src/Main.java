import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = in.nextInt();

        if(age == 21) {
            System.out.println("You will receive a wrist band.");
        } else if(age < 21) {
            System.out.println("You do not get a wrist band.");
        }
    }
}