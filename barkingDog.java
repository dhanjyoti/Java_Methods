import java.io.*;
import java.util.*;

public class BarkingDog{
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        } else if (barking && (hourOfDay < 8 || hourOfDay > 22)){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean barking = sc.nextBoolean();
        int hourOfDay = sc.nextInt();
        System.out.println(shouldWakeUp(barking, hourOfDay));
    }
} 