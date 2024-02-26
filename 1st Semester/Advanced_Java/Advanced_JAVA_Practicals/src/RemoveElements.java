import java.util.*;
public class RemoveElements
{ 
 public static void main(String[] argv)
{
  Collection<String> list1=new HashSet<String>();
  /*list1.add("red");
  list1.add("green");
  list1.add("yellow");*/

Collection<String> list2=new HashSet<String>();
  list2.add("red");
  list2.add("blue");
  list2.add("yellow");

/*boolean isRemoved =list1.removeAll(list2);
System.out.println("Elements removed from List1: "
                           + isRemoved); 
 //list1.remove("red");*/
 System.out.println(list1.isEmpty());
 
}
}