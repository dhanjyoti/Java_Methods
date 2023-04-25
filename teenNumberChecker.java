import java.util.Scanner;

public class TeenNumberChecker{
    public static boolean hasTeen(int a, int b, int c){
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public static boolean isTeen(int num){
        return num >= 13 && num <= 19;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

        boolean hasTeen = hasTeen(a, b, c);
        if(hasTeen){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.print("Enter a number: ");
        int num=s.nextInt();

        boolean isTeen = isTeen(num);
        if(isTeen){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}