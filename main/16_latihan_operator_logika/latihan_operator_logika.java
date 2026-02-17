import java.util.Scanner;

public class latihan_operator_logika {
    public static void main(String[] args) {
        // tebakan
        Scanner InputUser = new Scanner(System.in);

        System.out.println("Tebak bilangan 1 sampai 10");

        int TebakanTrue = 5, Input;

        System.out.print("Masukan Tebakan anda : ");
        Input = InputUser.nextInt();

        boolean Tebakan = (TebakanTrue == Input);
        System.out.printf("Tebakan anda %s\n\n",Tebakan);

        // masukan angka
        System.out.print("Masukan angka antara 5 sampai 7 : ");
        Input = InputUser.nextInt();

        boolean DiDalamJangkauanKah = (Input >= 5) && (Input <= 7);
        System.out.println("Output : " + DiDalamJangkauanKah);

        // dah itu aja saya mau turu 21.22 :v
        
    }
}