import java.util.*;
public class WildCardDemo
{
public static void main(String args[])
{
ArrayList<Integer> list1=new ArrayList<>();
list1.add(4);
list1.add(5);
list1.add(6);
System.out.println("Total sum is: "+sum(list1));
}

public static int sum(List<? extends Number>list)
{
int sum=0;
for(Number num:list)
{
sum +=num.intValue();
}

return sum;
}
}