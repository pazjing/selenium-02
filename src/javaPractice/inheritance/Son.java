package javaPractice.inheritance;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Son extends GrandFather {

    public static void main (String[] args) {

        Son son1 = new Son();
        son1.city();
        son1.country();

        int i = son1.age;

    }

    public void wife(){
        System.out.println("wife is sammy");
    }

}
