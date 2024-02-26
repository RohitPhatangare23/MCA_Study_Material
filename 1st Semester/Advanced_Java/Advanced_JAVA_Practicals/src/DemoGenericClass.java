//Java program to demonstrate a Generic class
class GenericClass<T>
{
    T ob;
    GenericClass(T obj)
    {
       ob=obj;
    }
    T getObj()
    {
       return ob;
    }
    void showType( )
    {
       System.out.println("Type of T is "+ob.getClass());
    }
}

public class DemoGenericClass
{
   public static void main(String args[])
   {
      GenericClass<Integer> iob=new GenericClass<Integer>(88);
      GenericClass<Double> dob=new GenericClass<Double>(8.8);
      iob.showType();
      dob.showType();
      Integer i=iob.getObj();
      System.out.println("Value of i is  "+i);
      Double d=dob.getObj();
      System.out.println("Value of d is  "+d);
      
   }
}