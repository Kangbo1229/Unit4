import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        System.out.println("Welcome to Piglet!");
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int num = (int)(Math.random()*6+1);

        while (num!=1){
            System.out.println("You rolled a "+num+"!");
            System.out.println("Roll Again?");
            String user = scan.next();
            if (user.equals("yes")) {
                total += num;
            }
            else if (user.equals("no")) {
                total += num;
                System.out.println("You got "+total+" points.");
                break;
            }
            else {
                System.out.println("Invalid Response");
                System.out.println("Roll again?");
                user = scan.next();
            }
            num = (int)(Math.random()+6+1);
        }
        if (num ==1){
            System.out.println("You rolled a "+num+"!");
            System.out.println("You got 0 points.");
        }

    }
}
