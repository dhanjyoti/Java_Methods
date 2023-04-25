import java.util.Scanner;

public class EqualSumChecker{
    public static boolean hasEqualSum(int a, int b, int total){
        return (a+b)==total;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int total=sc.nextInt();
        boolean result=hasEqualSum(a, b, total);
        System.out.println(result);
    }
}