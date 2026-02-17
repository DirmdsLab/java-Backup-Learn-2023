import java.util.Scanner;

public class exception_part2 {
    public static void main(String[] args) {
        Scanner InputUser = new Scanner(System.in);
        int Input = 0;
        System.out.print("Masukan Sesuatu : ");

        // exception biasa
        try {
            Input = InputUser.nextInt();
            System.out.println("Hasil : " + Input);
        } catch (Exception e) {
            System.err.println("Eror Bang");
        }

        // masukan ke fungsi
        
        Periksa(Input);
        
        // pakai trow exception
        int[] ListArray = {1,2,3,4,5};
        int ArrayNum = 5;

        try {
            CekArray(ListArray, ArrayNum);
        } catch (Exception e) {
            System.err.println("Eror Bang ^_^");
        }

        System.out.println("Akhir Dari program");

    }   

    private static int CekArray (int[] InpurArray, int Index) throws Exception {
        int buffer;
        buffer = InpurArray[Index];
        return buffer;
    }
    
    private static int Periksa (int Input){
        Scanner InputUser = new Scanner(System.in);

        try {
            System.out.print("Masukan sesuatu : ");
            Input = InputUser.nextInt();
            System.out.println("Hasil : " + Input);
        } catch (Exception e) {
            System.err.println("Eror Bang");
        }
        return Input;
    }

}


// ya gitulah ^_^