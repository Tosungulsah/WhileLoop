package day17_While_DoWhile;

public class FrequencyOfJavaWord {
    public static void main(String[] args) {

        String word= "JavaJavaJavaJava";


        int frequency=0;

        for (int i = 0; i < word.length()-3; i++) {
            String eachSub= word.substring(i,i+4);
           // System.out.println(eachSub);
            if(eachSub.equals("Java")){
                frequency++;
            }
        }
        System.out.println("frequency = " + frequency);

    }
}
