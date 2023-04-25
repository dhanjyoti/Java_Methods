import java.io.*;
import java.util.*;

public class LeapYear{
    public static boolean isLeapYear(int year){
        if(year<1 || year>9999){
            return false;
        } else if (year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        } 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(isLeapYear(year));
    }
}