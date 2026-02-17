public class Aritmatika{
    public static void main(String[] args){
        // tambah tambah dan kali kali :)
        int x = 7;
        int y = 5;
        int hasil;

        // angka awal
        System.out.println("Nilai Awal");
        System.out.println("Nilai Int x : " + x);
        System.out.println("Nilai Int y : " + y);

        // di tambah
        hasil = x + y;
        System.out.println("\nHasil Penjumlahan Dari " + x + " + " + y + " = " + hasil); // cara 1

        // pengurangan
        hasil = x - y;
        System.out.printf("Hasil Pengurangan Dari %d - %d = %d",x,y,hasil); // lebih simple

        // perkalian
        System.out.printf("\nHasil Perkalian   Dari %d x %d = %d",x,y,(x*y)); // cara lain

        // hasil pembagian
        System.out.printf("\nHasil Pembagian   Dari %d / %d = %d ",x,y,(x/y)); // bakal jadi int tapi bisa di rubah ke float
        
        // hasil modulus
        System.out.printf("\nHasil Sisa        Dari %d %% %d = %d ",x,y,(x%y));

        // gitulah kira kita :v

    }
}