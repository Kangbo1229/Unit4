public class NestedLoops {
    public static String xSquare(int num) {
        String blank = "";
        for (int x=1; x <=5; x++) {
            for (int y=1; y <= 5; y++)
             blank += "X";
        }
        return blank;
    }
    public static void main (String[] args) {
        System.out.print(xSquare(5));
    }
}
