public class StringExercises {
    public static String printTheLetters(String s){
        String blank = "";
        int L = s.length();
        for (int i = 0; i < L; i++) {
            String w = s.substring(i,i+1);
            blank += w+"\n";
        }
        return blank;
    }
    public static String everyOtherLetter(String s){
        String blank = "";
        int L = s.length();
        for (int i=0; i<L; i+=2){
            String w = s.substring(i,i+1);
            blank += w;
        }
        return blank;
    }
    public static int countTheVowels(String s){
        int L = s.length();
        int count =0;
        s = s.toLowerCase();
        for (int i=0; i<L; i++){
            String w = s.substring(i,i+1);
            if (w.equals("i")||w.equals("e")||w.equals("o")||w.equals("u")||w.equals("a")){
                count ++;
            }
        }
        return count;
    }
    public static String differentStrings(String s1, String s2) {
        int L = s1.length();
        int w = s2.length();
        int n = 0;
        if (s1.compareTo(s2) == 0) {
            return s1 + " and " + s2 + " are the same";
        }
        if (L > w){
            for (int i = 0; 0 < w; i++) {
                if (s1.substring(i, i + 1).equals(s2.substring(i, i + 1)) == false) {
                    n = i + 1;
                }
            }
            if (n == 0)
                n = w + 1;
            }
            else if (L < w) {
                for (int I = 0; I < w; I++) {
                    if (s1.substring(I, I + 1).equals(s2.substring(I, I + 1)) == false) {
                        n = I + 1;
                    }
                }
                if (n == 0)
                    n = w + 1;
                }
                else
                    for (int I = 0; I < w; I++) {
                        if (s1.substring(I, I + 1).equals(s2.substring(I, I + 1)) == false) {
                            n = I + 1;
            }
        }
        return s1 + " and " + s2 + " are not the same. They differ at letter number " + n;
    }
    public static void main(String[] args){
        //System.out.println(printTheLetters("pizza"));
        //System.out.println(everyOtherLetter("Computer Science"));
        //System.out.println(countTheVowels("COMPUTER science"));
        System.out.println(differentStrings("aardvark", "aardvark"));
    }


}
