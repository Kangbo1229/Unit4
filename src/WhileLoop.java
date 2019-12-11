import java.util.Scanner;

public class WhileLoop {

    static Scanner scan = new Scanner(System.in);

    public static String fromHereToThere(int x, int y) {
        String num = "";
        while (x<=y) {
            if (x>y) {
                return "Invalid input";
        }
            num +=x+" ";
            x++;
        }

        return num;

    }

    public static String factors(int a) {
        String fact = "";
        //System.out.println("factors(" + a + ")->The factors of " + a + " are:");
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                fact += i + " ";
            }
        }
        return "The factors of " + a + " are: " + fact;
    }
    public static String CountPosAndNeg() {
        System.out.print("Enter a positive or negative number or 0 to quit: ");
        int num = scan.nextInt();
        int posCount = 0, negCount = 0;
        while( num != 0) {
            System.out.println(num);
            if (num>0) {
                posCount++;
            }
            else if (num<0) {
                negCount++;
            }
            num = scan.nextInt();
        }
        return "There were" + posCount + "positive and" + negCount + "negative numbers.";

    }
    public static String findMinAndMax() {
        int counter = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (counter<5) {
            System.out.print("Number: ");
            int num = scan.nextInt();
            counter += 1;
            if (num<min){
                min=num;
            }
            if (num>max){
                max=num;
            }
        }
        return "Max value is: "+ max +"\nMin value is: "+ min;

    }
    public static String gradePoint() {
        int counter = 0;
        double total = 0;
        while (counter < 7) {
            System.out.println("Enter seven letter grades (A,B,C,D, or F)");
            String grade = scan.nextLine();
            counter += 1;
            if (grade.equals("A")) {
                total +=4.0;
            }
            else if (grade.equals("B")) {
                total += 3.0;
            }
            else if (grade.equals("C")) {
                total += 2.0;
            }
            else if (grade.equals("D")) {
                total +=1.0;
            }
            else {
                total += 0.0;
            }
        }
        total /=7;
        total+=100;
        total = (int)(total+0.5);
        total /= 100;
        return "GPA = "+ total;

    }

    public static void main(String [] args) {
        System.out.println(fromHereToThere(20,30));
        System.out.println(factors(6));
        System.out.println(CountPosAndNeg());
        System.out.println(findMinAndMax());
        System.out.println(gradePoint());

    }


}
