interface Type1
{
 int getStringLength(String str);
}
interface Type2
{
 int getMethod(String str);
}
public class LambdaTypeInference
{
 public static void main(String args[])
 {
  Type1 t1=(str)->str.length();
  Type2 t2=(str)->str.length();
  String name="Java";
  String name2="Abhijit";
  int len=t1.getStringLength(name);
  System.out.println(len);
  int len2=t2.getMethod(name2);
  System.out.println(len2);
 }
}