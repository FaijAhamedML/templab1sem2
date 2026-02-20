package Lab1;
import java.util.Scanner;
public class Demo {
    static void main() {
        EvenOddNumber Obj1= new EvenOddNumber();
        Scanner input= new Scanner(System.in);
        System.out.print("enter your number here-->");
        int num= input.nextInt();

        boolean numtype =Obj1.findEvenOrOdd(num);
        if (numtype==true){
            System.out.println("you are entered odd number");
        }else{
            System.out.println("you are entered Even number");
        }
    }

}
