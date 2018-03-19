package javaPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class practice1 {

    public static void main (String[] args) {

//        String str = "Payment $100 $200 paid";
//        System.out.println(str.charAt(8));
//        System.out.println(str.contains("$"));
//        System.out.println(str.lastIndexOf("$"));
//        System.out.println(str.substring(str.lastIndexOf("$")));

        String path = "/Users/jingbai/Qrious/dev/transport/transport-openshift";
//        String parts[] = path.split("/");
//        System.out.println(parts.length);
//        System.out.println(parts[parts.length-1]);


       Pattern pattern = Pattern.compile("/\\w+-*\\w+");
       Matcher matcher = pattern.matcher(path);
       String s = null;
       while(matcher.find()) {
            s = matcher.group(0);
        }
        System.out.println(s);

    }
}
