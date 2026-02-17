import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner InputUser = new Scanner(System.in);
        int Jumlah = 0;
        int Input;

        // masukan input
        System.out.print("Masukan Jumlah Pengulangan : ");
        Input = InputUser.nextInt();

        // tokoh utama
        while (Jumlah < Input) {
            System.out.println("Total Pengulangan : " + ++Jumlah);
            // disini juga bisa pakai break
        }

        System.out.println("Finish");

    }
}