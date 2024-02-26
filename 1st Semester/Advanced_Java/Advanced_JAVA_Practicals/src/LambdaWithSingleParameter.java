interface Greet
{
  public String greet(String name);
}
class LambdaWithSingleParameter
{
 public static void main(String args[])
 {
  Greet g=(name)->{return("Hello "+name);};
  System.out.println(g.greet("Abhi"));
 }
}