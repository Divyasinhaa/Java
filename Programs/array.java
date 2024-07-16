package Programs;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int physics=97;
        int chem=98;
        int eng=95;
        int[] marks=new int[3];
        marks[0]=97;
        marks[1]=98;
        marks[2]=95;

        //Length
        //System.out.println(marks.length);

        //sort
        System.out.println(marks[2]);
        Arrays.sort(marks);

        int[] m={97,98,99};
        int[][] finalm={{45,21,54},{34,65,56}};
        System.out.println(finalm[0][1]);
        System.out.println(m[1]);
    }
}
