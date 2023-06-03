import org.w3c.dom.ls.LSOutput;

public class SumofTwoNum {
    public int sum(){
        int num1 = 10;
        int num2 = 20;
        int num3 = num1+num2;

        return num3;
    }



    public static void main(String[] args) {
        SumofTwoNum SN= new SumofTwoNum();
        int out = SN.sum();
        System.out.println("10 + 20 = " + out);




    }
}
