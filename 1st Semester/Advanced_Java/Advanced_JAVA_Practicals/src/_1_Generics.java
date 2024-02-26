import java.util.ArrayList;
import java.util.Scanner;
//we are passing classes to already define classes;

/*
    Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types)
    to be a parameter to methods, classes, and interfaces.
    Using Generics, it is possible to create classes that work with different data types.
    An entity such as class, interface, or method that operates on a parameterized type is a generic entity

    Types Of Generic = 1)Generic Method
                        2) Generic Classes
* */
class Mygeneric<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public Mygeneric(int val, T1 t1,T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}




public class _1_Generics {
    /*
    generics introduced from jdk 5.0 onwords
    very similar to c++ templete but not same;
     */
    static int max(int a, int b){
        if (a>b){
            System.out.println(a+" is max");
        }
        else {
            System.out.println(b+" is max");
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println("This is 1st lectutre");
        max(5,6);
        max(9,4);

        //<Integer> kis class ka object app  es arraylist me rakhana chahoge
        //we use built in generic classes
        ArrayList<Integer> arrayList=new ArrayList();

        //ArrayList<int> arrayList2=new ArrayList(); //Type argument cannot be of primitive type shows ERROR
        //arrayList.add("Rohit"); //you can't add string bec this is INTEGER Type _1_Arraylist

        arrayList.add(15);
        arrayList.add(13);

//        arrayList.add(22.9); // error
//        arrayList.add('c');  // error
//        arrayList.add("Rohit"); //error

        //incompatible types: java.lang.Object cannot be converted to int (need type casting)
        //int B= arrayList.get(1); //we can't do this
        int a=(int) arrayList.get(1); // you can  get only integer not float,char,string
        int s= (int)arrayList.get(0); // it give runtime error you type cast in int but you want to get string ? > ERROR

        System.out.println(arrayList);
        System.out.println(a);

        System.out.println("-------------------------------------------");

        Mygeneric<String,Integer> g1=new Mygeneric<>(23,"Rohit",9);
        String str=g1.getT1();
        System.out.println(str);

        Integer in=g1.getT2();
        System.out.println(in);



    }





            




}
