interface Temp
{
 double convert(double a);
}

public class ConvertTemp
{
 public static void main(String arg[])
 {
  Temp t1=(double a)->{return((a-32)*5/9);};
  System.out.println("The temperature is "+t1.convert(100));
 }
}