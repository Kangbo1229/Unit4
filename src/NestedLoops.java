public class NestedLoops {
    public static String xSquare(int n) {
        String blank = "";
        for (int x=1; x <=5; x++) {
            for (int y=1; y <= 5; y++)
             blank += "X";
        }
        return blank;
    }
    public static String xSquare2(int n) {
        String blank = "";
        for (int x=1; x <=8; x++) {
            for (int y=1; y <=8; y++)
                blank += "X";
        }
        return blank;
    }
    public static String flippedTriangle (int n) {
        String blank = "";
        for (int x = 6; x <= 1; x++) {
            for (int y = 6; y <= x; y++)
                blank += "*";
        }
        return blank;
    }
    public static String multiplicationTable (int n) {
        int a;
        int b;
        for (int x = 1; x <=9; x++) {
            for (int y = 1; x<= 9; y++){
                System.out.print(" ");
            }
        }
        return "";
    }
    public static void main (String[] args) {
       // System.out.print(xSquare(5));
       // System.out.print(xSquare2(8));
        System.out.print(flippedTriangle(6));
        System.out.print(multiplicationTable(1));
    }
}
