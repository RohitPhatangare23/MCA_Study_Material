import java.util.ArrayList;
import java.util.List;

public class _2_Wrapper_Class {
    public static void main(String[] args) {
        System.out.println("WAP To demonstrate a Wrapper Class");
        int a=13;
        System.out.println("a= "+a);

        //https://www.javatpoint.com/wrapper-class-in-java

        Integer object = new Integer(25);
        // returns the value of this Integer as an int
        int i = object.intValue();
        System.out.println("Value of i is: " + i);

        Double dobj=new Double(89.9);
        System.out.println(dobj);
        // In Single Line
        System.out.println("Float to Int "+new Double(12.5).intValue());

        Integer[] intarray={10,20,30,40,50};
        System.out.println("array in wrapper Class "+intarray[0]+","+intarray[1]+","+intarray[2]);

        // in premitive
        int[]  b={22,55,88,99};
        System.out.println(b[0]);

        List L=new ArrayList();
        L.add("Rohit");
        L.add("Raj");

        System.out.println(L);

        List<String> list=new ArrayList<String>();

    }
}
