import java.util.Arrays;

public class latihan_array {
    public static void main(String[] args) {
        // cara langsung
        System.out.println("Tambah array");
        int[] TambahArray1 = {1,2,3,4};
        int[] TambahArray2 = {1,2,3,4};
        int[] HasilTambah = new int[TambahArray1.length];

        for (int i = 0; i < TambahArray1.length; i++){
            HasilTambah[i] = TambahArray1[i] + TambahArray2[i];
        }

        System.out.println(Arrays.toString(TambahArray1));
        System.out.println(Arrays.toString(TambahArray2));
        System.out.println("============ +");
        System.out.println(Arrays.toString(HasilTambah));
        
        // pakai fungsi 
        System.out.println("\nTambah Pakai fungsi");
        TambahArray(TambahArray1, TambahArray2);
        
        // gabung array
        System.out.println("\n\nGabung array");
        int[] HasilGabung = GabungArray(TambahArray1, TambahArray2);
        System.out.println(Arrays.toString(HasilGabung));

        // sort kebalik
        System.out.println("\nSort Kebalik");
        int[] SortKebalik = SortKebalik(HasilGabung);
        System.out.println("Hasil : " + Arrays.toString(SortKebalik));
        





    }

    // tambah array
    private static void TambahArray (int[] InputArray1, int[] InputArray2) {
        int[] output = new int[InputArray1.length];
        for (int i = 0; i < InputArray1.length; i++){
            output[i] = InputArray1[i] + InputArray2[i];
        }
        System.out.println(Arrays.toString(InputArray1));
        System.out.println(Arrays.toString(InputArray2));
        System.out.println("============ +");
        System.out.println(Arrays.toString(output));
    }  


    // gabung
    private static int[] GabungArray (int[] InputArray1, int[] InputArray2) {
        int[] GabungArray = new int[InputArray1.length+InputArray2.length];
        int poin = 0;
        for (int i = 0; i < InputArray1.length+InputArray2.length; i++){
            if (i < InputArray1.length) {
                GabungArray[i] = InputArray1[poin];
                poin++;
            } else {
                GabungArray[i] = InputArray2[poin];
                poin++;
            }
            if (poin == InputArray1.length) {
                poin = 0;
            }
        }
        return GabungArray;
    }

    // sort kebalik
    private static int[] SortKebalik (int[] InputArray){
        int[] buffer = new int[InputArray.length];
        int bufferNum = InputArray.length;
        Arrays.sort(InputArray);

        for (int i = 0; i < InputArray.length; i++){
            buffer[i] = InputArray[bufferNum-1];
            bufferNum--;
        }


        return buffer;
    }


    // gitulah pahami aja ^_^

}