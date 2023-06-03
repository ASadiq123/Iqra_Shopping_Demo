import java.util.Scanner;
public class LargestNumInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num = sc.nextInt();
        System.out.println( "Enter 2nd number");
        int num1 = sc.nextInt();
       // System.out.println("The largest num between " + num + "and" + num1 + "is" );

        if (num>num1){
            System.out.println( "The largest num between" + num + "and" + num1 + "is" + num);
        }
        else if (num1>num){
            System.out.println( "The largest num between" + num + "and" + num1 + "is" + num1);
        }
        else{
            System.out.println( "both numbers are equal");

        }


    }

}
