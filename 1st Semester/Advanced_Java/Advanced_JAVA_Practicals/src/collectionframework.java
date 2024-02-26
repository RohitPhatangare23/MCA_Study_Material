import java.util.*;
public class collectionframework
{
    public static void main(String arg[])
    {
        LinkedList<String> list=new LinkedList<>();
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("April");
        list.add("May");
        list.add("June");
        Iterator<String> itr1=list.iterator();
        ListIterator<String> itr2=list.listIterator(list.size());
        System.out.println("\n******Forward Direction********");
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
        System.out.println("\n******Backward Direction********");
        while(itr2.hasPrevious())
        {
            System.out.println(itr2.previous());
        } 

    }
}