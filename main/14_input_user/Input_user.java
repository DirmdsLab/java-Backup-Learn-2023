import java.util.Scanner; // toko utama

public class Input_user {
    public static void main(String[] args) {
        Scanner InputUser = new Scanner(System.in); 

        int x, y, output;
        System.out.println("Perkalian sederhana");

        System.out.print("Masukan Angka pertama : ");
        x = InputUser.nextInt();
        
        System.out.print("Masukan Angka kedua :");
        y = InputUser.nextInt();
        
        output = x * y;
        
        System.out.printf("Hasil Perkalian Dari %d Dan %d = %d",x,y,output);

        // gitulah sesuai yang di atas :v

    }
}