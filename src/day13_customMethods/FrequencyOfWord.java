package day13_customMethods;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String s = "Java java jAvA python python";
        String w = "java";

        System.out.println( frequencyOfWord(s, w) );

    }

    public static int frequencyOfWord(String sentence, String word){
        sentence = sentence.toLowerCase();
        word =  word.toLowerCase();
        String temp = sentence.replace( word,  "a".repeat(word.length()-1) );

        int frequency = sentence.length() - temp.length();

        return frequency;

    }

}

/*
6. Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 4
 */