import java.io.*;
import java.util.*;

public class PositiveNegativeZero{
    public static int checkNumber(int number){
        if(number>0){
            System.out.println("positive");
        }
        else if(number<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        checkNumber(number);
    }
}