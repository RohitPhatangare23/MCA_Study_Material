interface ktom
{
public double distance(double d);
}
public class pract542
{	//convert kilometer to miles
	public static void main(String []args) {
	ktom conv=(f)->{return 0.621371*f;};
	System.out.println(conv.distance(100));
	
	
	
   }
}