public class konversi_type_data{
    public static void main(String[] args){
        
        int NilaiInt = 200;
        
        // convert jadi long (safe)
        long NilaiLong = NilaiInt;
        System.out.printf("Nilai long      : %d\n",NilaiLong);

        // bakal masalah kalau di pindah ke nilai yang lebih kecil dari standar konversi misal short

        // short NilaiShort = NilaiInt; (bakal eror)
        
        byte NilaiByte = (byte)NilaiInt;
        
        System.out.println("Hasil Konversi  : " + NilaiByte); // bakal mutar mutar di byte
        // sampai nemu nilai yang pas, efeknya nilai nya tidak sesuai dengan nilai awal

        // bagi bagi part 1
        int x = 10;
        int y = 3;
        int hasil = x / y;
        System.out.println("\nHasil Pembagian Int dengan Int");
        System.out.printf("%d   / %d = %d\n",x,y,hasil); // nilai bakal tetap int
        
        float x_float = 10;
        y = 3;
        System.out.println("\nHasil Pembagian Float dengan Int");
        System.out.println(x_float + " / " + y + " = " + (x_float/y));

        // bagi bagi part 2
        x = 10;
        y = 3;
        float Output = (float) x / y ;
        System.out.println("\nHasil Pembagian Int dengan Int Tapi Output Float");
        System.out.printf("%d   / %d = %f",x,y,Output);

        System.out.println("\n\nAkhir ^_^");
    }
}