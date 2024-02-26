package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _2_List {
    public static void main(String[] args) {
//        index start  from 0 in list
        List lst=new ArrayList();
        lst.add(10);  //index = 0
        lst.add(20);
        lst.add(30);
        lst.add(30); // add duplicate element
        lst.add(3,60);
        lst.add(4,90);
        lst.add(null);
        lst.add(null);
        //lst.add(5,60); //IndexOutOfBoundsException (In List Element add based on index  ) // add index 4
        System.out.println(lst);

        //print element one by one
        Iterator itr=lst.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        lst.iterator();
        lst.listIterator(); // lsit have both for iteration






    }
}
