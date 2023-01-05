package org.sunglowsys.InterviewProgram;

public class NumberReverse {
    public static void main(String[] args) {
        NumberReverse reverse = new NumberReverse();
        reverse.reverseNumber(12345);
        reverse.getPalindrome(121);

    }
    public int reverseNumber(int num) {
        int rem, rev = 0;
        while (num!=0) {
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        return rev;

    }
    public int getPalindrome(int num) {
        int temp = num;
        int rev = reverseNumber(num);
        if (rev==temp) {
            System.out.println("no is palindrome: " +num);
        }
        else {
            System.out.println("no is not palindrome: "+ num);
        }
        return num;
    }
}
