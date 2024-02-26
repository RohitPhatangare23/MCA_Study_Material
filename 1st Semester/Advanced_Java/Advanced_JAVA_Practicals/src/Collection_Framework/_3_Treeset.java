package Collection_FrameWork;

import java.util.HashSet;
import java.util.TreeSet;

public class _3_Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(25);
        System.out.println(treeSet);
        System.out.println("first element:"+treeSet.first());
        System.out.println("last element:"+treeSet.last());
        System.out.println("headset of 30:"+treeSet.headSet(30));//10,20,25
        System.out.println("tailset of 20:"+treeSet.tailSet(20));//20,25,30
        System.out.println("lower than 25:"+treeSet.lower(16));
        System.out.println("floor of 23:"+treeSet.floor(23));//same element give lesser value of 23 is 20

        System.out.println("higher of 23:"+treeSet.higher(23)); // give first higher value. is 25
        System.out.println("ceiling of 23:"+treeSet.ceiling(18));
        System.out.println("pollfirst of 25:"+treeSet.pollFirst());
        System.out.println("PollLast of 25:"+treeSet.pollLast());
        System.out.println("After pollfirst and polllast");
        System.out.println(treeSet);
        HashSet<String> set=new HashSet<>();
        set.add("B");
        set.add("A");
        set.add("C");
        set.add("D");
        TreeSet<String> sortedSet=new TreeSet<>(set);
        System.out.println(sortedSet);
    }
}
