import java.util.Arrays;
import java.util.List;
class LowerBoundedWildcardDemo {
 public static void main(String[] args) {
 //Lower Bounded Integer List 
 List<Integer> list1 = Arrays.asList(1,2,3,4);
 //Integer list object is being passed 
 print(list1);
 //Lower Bounded Number list 
 List<Number> list2 = Arrays.asList(1,2,3,4);
 //Integer list object is being passed 
 print(list2);
 }
 public static void print(List<? super Integer> list) {
 System.out.println(list);
 }
}