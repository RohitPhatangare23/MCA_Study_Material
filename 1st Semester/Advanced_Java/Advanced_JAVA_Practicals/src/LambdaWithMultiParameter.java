interface Addition
{
 int add(int a,int b);
}

public class LambdaWithMultiParameter
{
 public static void main(String arg[])
{
 Addition t1=(int a,int b)->{return (a+b);};
 System.out.println(t1.add(3,4));
}
}

