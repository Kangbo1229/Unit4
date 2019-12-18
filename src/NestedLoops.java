public class NestedLoops {

    public static String xSquare(){
        String blank = "";
        for (int i=0; i<5; i++){
            for(int I=0; I<5; I++){
                blank += "X";
            }
            blank+="\n";
        }
        return blank;
    }
    public static String xSquare2(int n) {
        String blank = "";
        for (int i = 0; i < n; i++) {
            for (int I = 0; I < n; I++) {
                blank += "X";
            }
            blank += "\n";
        }
        return blank;
    }
    public static String flippedTriangle(int n) {
        String blank = "";
        for (int i = 0; i < n; i++) {
            for (int I = 0; I < n; I++) {
                if (i + I < 6) {
                    blank += "*";
                }
            }
            blank += "\n";
        }
        return blank;
    }
    public static String multiplicationTable(int n){
        String blank = "";
        for (int i=1; i<=9; i++){
            for (int I=1; I<=9; I++){
                if (i*I<100){
                    blank += " "+i*I;
                }
            }
            blank += "\n";
        }
        return blank;
    }
    public static void main(String [] args) {
        System.out.println(xSquare());
        System.out.println(xSquare2(8));
        System.out.println(flippedTriangle(6));
        System.out.println(multiplicationTable(9));
    }
}