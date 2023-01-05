package org.sunglowsys.InterviewProgram;

public class LeapYear {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        leapYear.checkLeap(2016);

    }

    public int checkLeap(int year) {

        if (year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0)) {
            System.out.println("leap year");
        }
        else {
            System.out.println("not leap year");
        }
        return year;
    }
}
