import java.util.Arrays;

public class array_start {
    public static void main(String[] args) {
        
        // bagian 1
        int[] KumpulanInt = {1,2,3};

        // print manual
        System.out.println(KumpulanInt[0]);

        // ganti nilai
        KumpulanInt[1] = 100;
        System.out.println(KumpulanInt[1]);

        // pakai impor java
        System.out.println(Arrays.toString(KumpulanInt));

        // bagian 2
        int[] KumpulanInt_part2;
        KumpulanInt_part2 = new int[7];
        KumpulanInt_part2[1] = 100;
        System.out.println(Arrays.toString(KumpulanInt_part2));
        
        // bagian 3
        int[] KumpulanInt_part3;
        KumpulanInt_part3 = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(KumpulanInt_part3));
        
        // bagian 4
        int[] KumpulanInt_part4 = new int[]{1,2,3};
        System.out.println(Arrays.toString(KumpulanInt_part4));

        // gitulah kira kira :)

    }
}
