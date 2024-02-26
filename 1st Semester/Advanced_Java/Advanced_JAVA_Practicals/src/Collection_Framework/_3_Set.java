package Collection_Framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _3_Set {
    public static void main(String[] args) {
        //Set is not index based data Structure
        Set s=new HashSet();
        s.add(50);
        s.add(40);
        s.add(30);
        s.add(70);
        s.add(90);
        s.add(90); // doesnot allow duplicate element
        s.add(null); //
        s.add(null); // null contain only onece,doesnot allow duplicate element


        System.out.println(s); // Set is not Follow insertion order

        Iterator itr=s.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        s.iterator(); // bit in set we have only one method for iteration
    }
}
