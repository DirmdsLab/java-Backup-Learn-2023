import java.util.Arrays;

public class array_lebih_dalam {
    public static void main(String[] args) {
        System.out.println("Array Lebih Dalam");

        int[] IntArray1 = {1,2,3,4,5};
        int[] IntArray2 = new int[5];
        IntArray2 = IntArray1; // bakal pakai alamat memory sama

        System.out.println("Array 1 : " + Arrays.toString(IntArray1));
        System.out.println("Array 2 : " + Arrays.toString(IntArray2));
        
        // kalau salah satu nilai di rubah ke 2 nya bakal ngikut
        IntArray1[0] = 10; // di rubah oleh array 1
        IntArray2[1] = 20; // di rubah oleh array 2
        
        System.out.println("Array 1 Setelah di rubah : " + Arrays.toString(IntArray1));
        System.out.println("Array 2 Setelah di rubah : " + Arrays.toString(IntArray2));
        // tapi outputnya ke rubah ke 2 nya
        
        
        EditArray(IntArray2); // sama saja dengan yang tadi
        
        System.out.println("Array 1 Setelah di rubah pakai fungsi : " + Arrays.toString(IntArray1));
        System.out.println("Array 2 Setelah di rubah pakai fungsi : " + Arrays.toString(IntArray2));

    }

    private static void EditArray (int[] Input) {
        Input[4] = 100;
    }

}
