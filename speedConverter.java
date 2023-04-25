import java.io.*;
import java.util.*;

public class SpeedConverter{
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }

        double milesPerHour = kilometersPerHour/1.609;
        long rounded = Math.round(milesPerHour);
        return rounded;
    }

    public static void printConverter(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if(milesPerHour==-1){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double kilometersPerHour=s.nextDouble();
        printConverter(kilometersPerHour);
    }
}