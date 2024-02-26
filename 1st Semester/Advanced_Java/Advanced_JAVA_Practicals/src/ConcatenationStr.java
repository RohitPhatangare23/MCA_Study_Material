interface Concatenation
{
 String concat(String str1,String str2);
}

public class ConcatenationStr
{
 public static void main(String arg[])
 {
  Concatenation con=(str1,str2)->{return (str1+str2);};
  System.out.println("The concatenated string is "+con.concat("Hello","Word"));
 }
}