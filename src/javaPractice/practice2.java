package javaPractice;


public class practice2 {

    public static void main (String[] args) {

        String input = "Summary";
        String output = reserve(input);
        System.out.println(output);

        int arr[] = {2,3,10,4,5,7};
        int sum = add(arr);
        System.out.println(sum);


    }

    public static String reserve(String input){

        String output = "";

        for(int i=input.length()-1; i>=0; i--){
            output = output + input.charAt(i);
        }
        return output;
    }

    public static int add(int[] input){

        int sum = 0;
        for(int i=0; i<input.length; i++){
            sum = sum + input[i];
        }
        return sum;
    }
}
