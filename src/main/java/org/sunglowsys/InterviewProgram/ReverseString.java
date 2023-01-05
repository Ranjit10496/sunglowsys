package org.sunglowsys.InterviewProgram;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString string = new ReverseString();
        System.out.println(string.reverseString("Ranjit"));
        System.out.println(string.reverseSentence("My name is Ranjit"));
        System.out.println(string.reverseSentence1("This my Laptop"));

    }

    public String reverseString(String str) {
        int lang = str.length();
        String rev = " ";
        for (int i = lang - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }

    public String reverseSentence(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");
        for (String word : words) {
            result.append(reverseString(word));
        }
        return result.toString();

    }
    public String reverseSentence1(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = sentence.split(" ");
        for (int i = words.length-1; i>=0; i--) {
            stringBuilder.append(words[i]).append(" ");
        }
        return stringBuilder.toString();
    }
}
