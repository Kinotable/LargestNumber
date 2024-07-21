import java.util.Scanner;

public class Main {

    public static int LargeNum(int num1, int num2, int num3){

        if (num1 >= num2 && num1 >= num3){
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        }else{
            return num3;
        }

    }
    public static int LargeNumTern(int num1, int num2, int num3){
        int L = ((num1 >= num2) && (num1 >= num3)) ? num1 : (((num2 >= num1) && (num2 >= num3)) ? num2 : num3);
             return L;
    }

    public static void main(String[] args) {

        //take three inputs from the user, Find the greatest of numbers

        Scanner s = new Scanner(System.in);
        System.out.println("enter the first number");
        int inp1 = s.nextInt();
        System.out.println("enter the second number");
        int inp2 = s.nextInt();
        System.out.println("enter the third number");
        int inp3 = s.nextInt();
        int LargeNUM = LargeNum(inp1,inp2,inp3);
        System.out.println("largest number is " + LargeNUM);
        int LargeNUMTern = LargeNumTern(inp1,inp2,inp3);
        System.out.println("largest number is using Ternary " + LargeNUMTern);
    }
}
