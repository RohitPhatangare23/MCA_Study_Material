import java.util.*;
public class ToUpperCase
{
    public static void main(String arg[])
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("April");
        list.add("May");
        list.add("June");
        list.add("July");
        list.add("August");
        list.add("September");
        list.add("Octomber");
        list.add("November");
        list.add("December");

        for(int i=0;i<list.size();i++)
        {
            String temp=list.get(i);
            System.out.println(temp.toUpperCase());
        }
    }
}