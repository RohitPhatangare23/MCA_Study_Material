interface Length
{
 double convert(double a);
}

public class ConvertLength
{
 public static void main(String arg[])
 {
  Temp t1=(double a)->{return(a*0.621371);};
  System.out.println("The length in miles "+t1.convert(2));
 }
}