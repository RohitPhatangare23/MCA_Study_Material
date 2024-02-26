import java.util.*;
public class TestHashSet
{
public static void main(String[] args)
	{
java.util.Set<String> hashSet=new java.util.HashSet<>();
hashSet.add("Pune");
hashSet.add("Mumbai");
hashSet.add("London");
hashSet.add("NewYork");
hashSet.add("Mumbai");
System.out.println(hashSet);
java.util.Set<String> linkedSet=new java.util.LinkedHashSet<>();
linkedSet.add("Pune");
linkedSet.add("Mumbai");
linkedSet.add("London");
linkedSet.add("NewYork");
linkedSet.add("Mumbai");
System.out.println(linkedSet);
for(String element:linkedSet)//for-each loop
System.out.println(element.toLowerCase()+" ");	
}
}