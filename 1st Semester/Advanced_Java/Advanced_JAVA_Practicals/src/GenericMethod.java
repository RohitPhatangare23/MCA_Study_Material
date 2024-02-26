//Java program to demonstrate a Generic method
public class GenericMethod
{
   public static <T> void print(T[] list)
   {
      for(int i=0;i<list.length;i++)
      System.out.println(list[i]+" ");
   }
   public static void main(String args[])
   {
      Integer[] i={1,2,3,4,5};
      Double[] d={1.1,3.4,4.5};
      GenericMethod.<Integer>print(i);
      GenericMethod.<Double>print(d);
   }
}