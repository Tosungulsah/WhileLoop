package day17_While_DoWhile;

public class FrequencyOFCat {
    public static void main(String[] args) {
        String word= "Cat Cat Dog Dog";

        int frequency=0;
        for (int i = 0; i <word.length()-2 ; i++) {
            String eachSub= word.substring(i,i+3); // we added 3 cos our wird is Cat
            if(eachSub.equals("Cat")){
              frequency++;
            }
        }
        System.out.println("frequency = " + frequency);
    }
}
