import java.util.Scanner;

// realita emang gitu sering beda ^_^
// pahami aja ya

public class latihan_void {
    public static void main(String[] args) {
        Print_Luas_Keliling_Img();
    }

    private static void Print_Luas_Keliling_Img () {
        System.out.println("Void Luas Keliling dan img persegi");

        Scanner InputUser = new Scanner(System.in);
        int InputPanjang, InputLebar;
        
        System.out.print("\nMasukan Panjang : ");
        InputPanjang = InputUser.nextInt();

        System.out.print("Masukan Lebar   : ");
        InputLebar = InputUser.nextInt();

        System.out.println("\nLuas     : " + Luas(InputPanjang, InputLebar));
        System.out.println("Keliling : " + Keliling(InputPanjang, InputLebar));
        ImgPersegi(InputPanjang, InputLebar);
        
    }

    // sistem nya
    private static int Luas (int Input1, int Input2) {
        return Input1 * Input2;
    }

    private static int Keliling (int Input1, int Input2) {
        return ((Input1 + Input2) * 2 );
    }

    private static void ImgPersegi (int Input1, int Input2) {
        int total_1, total_2 = 1;
        System.out.println("\nImg Persegi");
        while (total_2 <= Input2) {
            total_1 = 1;
            while (total_1 <= Input1) {
                System.out.print("* ");
                total_1++;
            }
            System.out.println();
            total_2++;
        }
    }

}