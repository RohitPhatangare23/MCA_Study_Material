import java.util.*;
public class IteratorInterface
{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        Iterator<Integer> itr=list.iterator();
        while(itr.hasNext())
        System.out.println(itr.next());

    }
}