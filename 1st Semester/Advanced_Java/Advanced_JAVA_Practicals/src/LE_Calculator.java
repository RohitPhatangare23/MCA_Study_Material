
interface calculator{
    public int cal(int a,int b);
}
public class LE_Calculator {
    public static void main(String[] args) {

        calculator sum=(a,b)->{
            System.out.print("addition = ");
            return  a+b;
        };

        calculator subtract=(a,b)->{
            System.out.print("Substraction = ");
            return a-b;
        };

        calculator multiplication=(a,b)->{
            System.out.print("Multiplication = ");
            return a*b;
        };

        calculator divide=(a,b)->{
            System.out.print("division = ");
            return a/b;
        };

        System.out.println(sum.cal(30,5));
        System.out.println(subtract.cal(30,5));
        System.out.println(multiplication.cal(30,5));
        System.out.println(divide.cal(30,5));
    }
}
