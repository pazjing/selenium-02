package javaPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class LisPractice {

    public static void main(String[] args)
    {

        //basicDemo();
        uniqueDemo();

    }

    public static void basicDemo(){
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("abcd");
        arrList.add("hello");
        arrList.add("java");
        arrList.add("jing");
        arrList.add(1,"number1");
        arrList.add("number 2");
        System.out.println(arrList);
        arrList.remove("number 2");
        arrList.remove(0);
        System.out.println(arrList);

        System.out.println(arrList.contains("jing"));
        System.out.println(arrList.size());
        System.out.println(arrList.get(1));

        String[] abc = new String[5];
        System.out.println(abc.length);

    }

    public static void uniqueDemo(){
        int[] arr = {5,6,4,5,7,8,6,8,9};

        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(!al.contains(arr[i])){
                al.add(arr[i]);
            }
        }

        Iterator<Integer> it = al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }


}
