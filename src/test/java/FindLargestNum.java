



public class FindLargestNum {
    public int Large(int num1, int num2) {
        if (num1>num2){
            System.out.println( "biggest num between" + num1 +"and" + num2 +"is" + num1);
            return num1;
        }

        else {
            System.out.println( "biggest num between" + num1 +"and" + num2 +"is" + num2 );
            return num2;
        }



        }

    public static void main(String[] args) {
        FindLargestNum FN = new FindLargestNum();
        int outcome = FN.Large(3, 2);



    }



}



