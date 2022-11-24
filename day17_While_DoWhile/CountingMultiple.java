package day17_While_DoWhile;

public class CountingMultiple {
    public static void main(String[] args) {
        String word="Python Java Python C++ Java Python";
        int countJava=0;
        int countPython=0;

        while(word.contains("Java")) {
            word = word.replaceFirst("Java", "");
            countJava++;
        }
        while(word.contains("Python")){
            word=word.replaceFirst("Python","");
            countPython++;
        }
        System.out.println("Frequency of Java: "+countJava+"\n"+"Frequency of python: " +
              countPython  );
        
        System.exit(0);
    }
}
