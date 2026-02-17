import java.util.Arrays;

public class operasi_array {
    public static void main(String[] args) {
        int[] IntArray_1, IntArray_2, IntArray_3, IntArray_4, IntArray_5;

        IntArray_1 = new int[]{1,2,3,4,5};
        IntArray_2 = new int[5];
        IntArray_3 = new int[5];

        // print jadi string
        System.out.println("Print Jadi String Normal : " + Arrays.toString(IntArray_1));
        PrintArray(IntArray_1);

        // copy array pakai for
        System.out.println("\nCopy array pakai for");
        for (int i = 0; i < IntArray_1.length; i++){
            IntArray_2[i] = IntArray_1[i];
        }
        PrintArray(IntArray_2);

        // copy pakai lib
        System.out.println("\ncopy pakai array");
        IntArray_3 = Arrays.copyOf(IntArray_1,5);
        PrintArray(IntArray_3);
        
        // copy pakai range
        System.out.println("\ncopy pakai rangefill");
        IntArray_4 = Arrays.copyOfRange(IntArray_1, 2, 5);
        PrintArray(IntArray_4);

        // coparasi array
        System.out.println("\nCompare array");
        PrintArray(IntArray_1);
        PrintArray(IntArray_4);
        if (Arrays.equals(IntArray_1,IntArray_4)) {
            System.out.println("Hasilnya sama");
        } else {
            System.out.println("Tidak sama");
        }
        
        // mana yang lebih besar
        IntArray_2[0] = 2;
        System.out.println("\nMana yang lebih besar");
        System.out.println(Arrays.compare(IntArray_1,IntArray_2));
        
        // cek index yang beda
        System.out.println("\nCek index yang beda");
        IntArray_2[0] = 1;
        IntArray_2[3] = 1;
        System.out.println(Arrays.mismatch(IntArray_1,IntArray_2));

        // sort array
        System.out.println("\nsort array");
        IntArray_5 = new int[]{5,3,1,4,2};
        PrintArray(IntArray_5);
        Arrays.sort(IntArray_5);
        PrintArray(IntArray_5);

        // search array
        System.out.println("\nSearch Array");
        System.out.println(Arrays.binarySearch(IntArray_5,3));



        // tambahn tapi video totuial 
        // revisinya ada di next materi
        // latihan array
        // yang ini pakai cara sendiri aja ^_^
        
        // sort array terbalik
        System.out.println("\nSort Terbalik");
        System.out.println("sebelum di balik : ");
        PrintArray(IntArray_5);
        int TempArray[] = new int[5];
        for (int i = 0; i < IntArray_5.length; i++) {
            TempArray[i] = IntArray_5[i];
        }
        int Temp = ((TempArray.length)-1);
        for (int i = 0; i < TempArray.length; i++) {
            IntArray_5[i] = TempArray[Temp];
            Temp--;
        }
        System.out.println("setelah di balik : ");
        PrintArray(IntArray_5);

        // agak ribet soal pakai logika baru belajar sampai ini aja ^_^


        // tambah tambah dua array
        System.out.println("\nTambah tambah array");
        int output = IntArray_1[1] + IntArray_2[3];
        System.out.printf("Hasil Penjumlahan dari %d Dan %d = %d\n",IntArray_1[1],IntArray_2[3],output);


        // menggabungkan 2 array
        System.out.println("\nGabung 2 array");
        int HasilGabungan[] = new int[(IntArray_1.length+IntArray_2.length)];
        int TotalLoop = 0;
        for (int i = 0; i < (IntArray_1.length+IntArray_2.length); i++){
            if (i < IntArray_1.length){
                HasilGabungan[i] = IntArray_1[TotalLoop];
                TotalLoop++;
            } else {
                HasilGabungan[i] = IntArray_2[TotalLoop];
                TotalLoop++;
            }
            if (i == IntArray_1.length-1) {
                TotalLoop = 0;
            }
        }
        System.out.println("Array 1 : " + Arrays.toString(IntArray_1));
        System.out.println("Array 2 : " + Arrays.toString(IntArray_2));
        System.out.println("Setelah di gabung : " + Arrays.toString(HasilGabungan));
        System.out.println("Dengan size : " + HasilGabungan.length);
        Arrays.sort(HasilGabungan);
        System.out.println("Setelah di sort : " + Arrays.toString(HasilGabungan));

        
        // ^_^


    }

    private static void PrintArray (int[] Input) {
        System.out.println("Print : " + Arrays.toString(Input));
    }

}
