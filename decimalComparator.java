import java.util.Scanner;

public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        int a=(int)(num1 * 1000);
        int b=(int)(num2 * 1000);
        return a==b;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        boolean result=areEqualByThreeDecimalPlaces(num1, num2);
        System.out.println(result);
    }
}