import java.util.Arrays; 
import java.util.List; 
public class UpperBoundedWildcardDemo 
{ 
public static void main(String[] args) 
{ 
//Upper Bounded Integer List 
List<Integer> list1= Arrays.asList(4,5,6,7); 
 
//Upper Bounded Double list 
List<Double> list2=Arrays.asList(4.1,5.1,6.1); 

show(list2);

 
} 
public static void show(List<? extends Number> list) 
{ 

for (Number i: list) 
{ 
  System.out.println(i);
} 

}
} 

