interface addition2 {
    public int line(int a, int b);
}

public class pract55_with_return_without_return {
    public static void main(String[] args) {
        //--------- without return ---------------
        //addition sum=(int a,int b)->a+b;
        //System.out.println(sum.line(100,20));

        //--------- with return ---------------
        addition2 sum = (a, b) -> {
            return a + b;
        };
        System.out.println(sum.line(10, 20));

    }
}