import java.util.Scanner;

public class latihan_matrix_part1 {
    public static void main(String[] args) {
        System.out.println("Operasi matrix Penjumlahan\n");
        
        Scanner InputUser = new Scanner(System.in);
        int[][] InputMatrix1;
        int[][] InputMatrix2;
        int InputNum1;
        int InputNum2;

        // masukan nilai baris dan kolom

        System.out.print("Masukan Jumlah Baris matrix : ");
        InputNum1 = InputUser.nextInt();
        System.out.print("Masukan Jumlah Kolom        : ");
        InputNum2 = InputUser.nextInt();

        InputMatrix1 = new int[InputNum1][InputNum2];
        InputMatrix2 = new int[InputNum1][InputNum2];

        // cek dulu
        

        InputMatrix(InputMatrix1,InputNum1,InputNum2,1);
        InputMatrix(InputMatrix2,InputNum1,InputNum2,2);
        
        // masuk ke proses

        System.out.println("Matrix 1");
        PrintMultyArray(InputMatrix1);
        System.out.println("\nDitambah Dengan\n");
        System.out.println("Matrix 2");
        PrintMultyArray(InputMatrix2);
        System.out.println("\nHasil : ");
        
        // hasil
        PrintMultyArray(TambahMatrix(InputMatrix1, InputMatrix2));

        

        // sedikit membingungkan tapi ngak ngaruh :v
        // pahami aja


    }

    // input matrix
    private static int[][] InputMatrix (int[][] Input, int InputNum1, int InputNum2, int List){
        Scanner InputUser = new Scanner(System.in);

        char[][] TandaInput = new char[InputNum1][InputNum2];

        for (int i = 0; i < TandaInput.length; i++){
            for(int j = 0; j < TandaInput[i].length; j++){
                TandaInput[i][j] = 'O';
            }
        }
        System.out.println();
        for (int i = 0; i < Input.length; i++){
            for (int j = 0; j < Input[i].length; j++){
                System.out.print("Masukan Angka Matrix " + List + " Posisi [");
                System.out.print(i + "][" + j + "]\n");
                TandaInput[i][j] = 'X';
                PrintMultyArrayChar(TandaInput);
                System.out.print("Isi Disini : ");
                InputNum1 = InputUser.nextInt();
                Input[i][j] = InputNum1;
                TandaInput[i][j] = 'O';
                System.out.println();
            }
        }
        return Input;
    }

    // print matrix
    private static void PrintMultyArray (int[][] Input) {
        for (int i = 0; i < Input.length; i++){
            for(int j = 0; j < Input[i].length; j++){
                System.out.print("[ " + Input[i][j] + " ]");
            }
            System.out.println();
        }
    }
    private static void PrintMultyArrayChar (char[][] Input) {
        for (int i = 0; i < Input.length; i++){
            for(int j = 0; j < Input[i].length; j++){
                System.out.print("[ " + Input[i][j] + " ]");
            }
            System.out.println();
        }
    }
    
    // tambah matrix
    private static int[][] TambahMatrix (int[][] Input1, int[][] Input2){

        for (int i = 0; i < Input1.length; i++){
            for(int j = 0; j < Input1[i].length; j++){
                Input1[i][j] = Input1[i][j] + Input2[i][j];
            }
        }
        return Input1;
    }

    // gw kira harus di cek tapi sistemnya kagak harus
    // jadi inputnya menyusun matrix tetap fix kotak 
    // jadi bakal true terus
    // ya kagak jadi gw pakai deh

    // cek matrix
    // private static boolean CekMatrix (int[][] Input1, int[][] Input2){
    //     boolean TrueKah;
    //     int[] Buffer1 = new int[Input1.length];
    //     int[] Buffer2 = new int[Input2.length];
    //     int CekBaris1 = Input1.length;
    //     int CekBaris2 = Input2.length;

    //     for (int i = 0; i < Input1.length; i++){
    //         Buffer1[i] = Input1[i].length;
    //     }
        
    //     for (int i = 0; i < Input2.length; i++){
    //         Buffer2[i] = Input2[i].length;
    //     }

    //     boolean HasilCek = CekBaris1 == CekBaris2;
    //     boolean HasilCekKolom = Arrays.equals(Buffer1, Buffer2);

    //     if(HasilCek && HasilCekKolom) {
    //         TrueKah = true;
    //     } else {
    //         TrueKah = false;
    //     }
    //     return TrueKah;
    // }


}
