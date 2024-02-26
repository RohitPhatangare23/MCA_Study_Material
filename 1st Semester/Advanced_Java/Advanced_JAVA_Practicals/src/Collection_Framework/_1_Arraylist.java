package Collection_Framework;

import java.util.ArrayList;

public class _1_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        //list.add("Mumbai");//error
        System.out.println(""+list);
        //get(index) method
        System.out.println("First element:" + list.get(0));
        list.add(0, 5);
        list.add(3, 90);
        System.out.println("After , Add Value at Particular index = "+list);
//        //set(index,obj)
        list.set(4,80);
        list.set(3,80);
        System.out.println("Replace Value At Particular Index = "+list);//
        System.out.println("Size Of ArrayList: " + list.size());//4
        System.out.println("Is ArrayList Empty: " + list.isEmpty());//False
        System.out.println("Is 50 Is ArrayList?: " + list.contains(50));//False
        System.out.println("Position Of 20: " + list.indexOf(20));//2
        list.add(1);
        list.add(20);
        System.out.println("Add 20 Duplicate Value : "+list);
        System.out.println("Position of 20: " + list.indexOf(20));
        System.out.println("Position of 20: " + list.lastIndexOf(20));  // index start from 0
        list.remove(1);
        System.out.println("After Removing Element At Index 1 From List : "+list);
        list.clear();
        System.out.println("After Clearing The List : "+list);
    }
}
