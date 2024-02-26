import java.util.*;
public class IteratorTest
{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Traversing elements with for loop");
        System.out.println("=====================================");
        for(int i=0;i<list.size();i++)
        System.out.println(list.get(i));
        System.out.println("Traversing elements with for-each loop");
        System.out.println("=====================================");
        for(Integer i:list)
         System.out.println(i);

    }
}