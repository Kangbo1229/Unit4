import java.util.Scanner;

public class WhileLoop {

    static Scanner scan = new Scanner(System.in);

    public static String fromHereToThere(int x, int y) {
        String num = "";
        while (x<y) {
            num +=x+" ";
            x++;
        }
        if (x>y) {
            return "Invalid input";
        }
        return num;

    }

    public static String factors(int a){
        int num = 12;
        System.out.println("factors("+num+")->")
    }
    public static void main(String [] args) {
        System.out.println(fromHereToThere();
    }


}
