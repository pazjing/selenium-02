package javaPractice;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.*;

public class mapPractice {

    public static void main(String[] args) {
        //setDemo();
       // mapDemo();
        uniqueDemo();
    }

    public static void setDemo() {
        HashSet<String> hs = new HashSet<>();
        hs.add("first");
        hs.add("second");
        hs.add("third");
        hs.add("second");
        System.out.println(hs);

        hs.add("forth");
        hs.remove("first");
        System.out.println(hs);

        Iterator<String> i = hs.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

    public static void mapDemo() {

        HashMap<String, String> hm = new HashMap();
        hm.put("zero", "value I");
        hm.put("first", "value am");
        hm.put("second", "value a");
        hm.put("third", "value boy");

        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        System.out.println(hm.containsKey("first"));

//        Set hs = hm.entrySet();
//        Iterator i = hs.iterator();
//        while (i.hasNext()) {
//            Map.Entry mapE = (Map.Entry) i.next();
//            System.out.println(mapE.getKey());
//            System.out.println(mapE.getValue());
//        }

        for(Map.Entry entry: hm.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    public static void uniqueDemo(){

        int[] arr = {4,5,5,5,6,6,7,8,6,7,9};

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<arr.length;i++){
            hs.add(arr[i]);
        }

        Iterator<Integer> it = hs.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


    }

}
