import java.util.Scanner;

public class aritmatika_grup {
    public static void main(String[] args) {
        System.out.println("Grup perkalian kurang bagi tambah gitulah ^_^");
        int Output = (10 + 5) * 2; // gitulah
        System.out.println("(10 + 5) * 2 ");
        System.out.println("Output : " + Output);

        // bagian user input
        Scanner InputUser = new Scanner(System.in);
        int kurung1, kurang2, lepas;

        System.out.println("\nJadi angkanya bakal di ginikan ( (kurung 1 + kurung2) * lepas )");

        System.out.print("Masukan angka yang di kurung 1 : ");
        kurung1 = InputUser.nextInt();
        
        System.out.print("Masukan angka yang di kurung 2 : ");
        kurang2 = InputUser.nextInt();
        
        System.out.print("Masukan angka yang di lepas : ");
        lepas = InputUser.nextInt();

        Output = ( kurung1 + kurang2 ) * lepas;
        
        System.out.println("Hasil nya : " + Output);

    }
}
