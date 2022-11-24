package day17_While_DoWhile;

public class FrequencyOfWord_while {
    public static void main(String[] args) {
        String word= "JAVA JAVA Python Python java JAVA";
        word=  word.toLowerCase();

        int frequency =0;
        while(word.contains("java")){
        word = word.replaceFirst("java",""); // string is immutable so you have to assign it again
            frequency++;

        }
        System.out.println(frequency);
    }
}
