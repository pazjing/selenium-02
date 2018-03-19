package javaPractice;


public class ArrayPractice {

    public static void main (String[] args) {

/*
    2   11  5
    3   0   7
    9   10  8
1) Print the minimum number from above matrix
2) Identify the column of the minimum number
3) Find the maximum number in identified column
 */

    int abc[][] = {{2,11,5},{3,0,7},{9,10,8}};
    int min = abc[0][0];
    int minCol = 0;


    for(int i=0; i<abc.length; i++) {

        for(int j=0;j<(abc.length/abc[0].length); j++) {

            if(abc[i][j] < min) {

                min = abc[i][j];
                minCol = j;

            }
        }
    }

    System.out.println("Minimum column number is " + minCol);
    System.out.println("Minimum number in the array is " + min);

    int max = min;

    for(int i=0;i<abc.length/abc[0].length; i++){

        if(abc[i][minCol] > max) {
            max = abc[i][minCol];
        }
    }

    System.out.println("Maximum number in identified column is " + max);


    }

}
