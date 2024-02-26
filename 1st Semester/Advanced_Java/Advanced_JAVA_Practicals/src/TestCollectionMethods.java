import java.util.*;
public class TestCollectionMethods
{
	public static void main(String args[])
	{
	   Collection <String> collection1=new ArrayList<>();
	   collection1.add("NewYork");
	   collection1.add("London");
	   collection1.add("Mumbai");
           collection1.add("Delhi");
	   System.out.println("Element inside collection1 are: ");
	   System.out.println(collection1);

	   Collection <String> collection2=new ArrayList<>();
	   collection2.add("pune");
	   collection2.add("portland");
	   collection2.add("Mumbai");
           System.out.println("Element inside collection2 are: ");
	   System.out.println(collection2);

           collection1.addAll(collection2);
  	   System.out.println("Element inside collection1 are: ");
	   System.out.println(collection1);

	   ArrayList<String> c1=new ArrayList<String>();
	   c1.addAll(collection1);
	   System.out.println("Element inside c1 are: ");
	   System.out.println(c1);

	   collection1.retainAll(collection2);
	   System.out.println("Element inside c1 are: ");
	   System.out.println(collection1);
	}
}
