public class FizzBuzz {
    public static String FizzBuzz(int num) {
        String blank = "";
        for (int i=1; i<num; i++){
            if (i%20 == 0 && i!=1){
                blank +="\n";
            }
            if (i%3 == 0 && i%5!=0) {
                blank += "Fizz ";
            }
            else if (i%3!=0 && i%5 ==0){
                blank += "Buzz ";
            }
            else if ( i%3==0 && i%5 ==0) {
                blank +="FizzBuzz ";
            }
            else {
                blank += i+ " ";
            }
        }
        return blank;

    }
    public static void main (String[] args){
        System.out.println(FizzBuzz(100));
    }
}
