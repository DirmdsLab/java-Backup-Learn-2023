import java.util.Scanner;

public class if_kalkulator {
    public static void main(String[] args) {

        System.out.println("Wellcome to program kalkulator sederhana (if)\n");

        // bagian 1
        float Input1, Input2;
        Scanner InputUser1, InputUser2, InputOperationUser;
        char InputOperation;

        // operasi 1
        System.out.print("Masukan angka : ");
        InputUser1 = new Scanner(System.in);
        Input1 = InputUser1.nextFloat();

        // operasi 2
        System.out.print("Pilih Opsi ( + , - , * , / ) : ");
        InputOperationUser = new Scanner(System.in);
        InputOperation = InputOperationUser.next().charAt(0);

        // operasi 3
        System.out.print("Masukan angka selanjutnya : ");
        InputUser2 = new Scanner(System.in);
        Input2 = InputUser2.nextFloat();


        // bagian 2
        if (InputOperation == '+') {
            System.out.printf("\nHasil %.1f %s %.1f = %.1f\n",Input1,InputOperation,Input2,(Input1+Input2));
        } else if (InputOperation == '-') {
            System.out.printf("\nHasil %.1f %s %.1f = %.1f\n",Input1,InputOperation,Input2,(Input1-Input2));
        } else if (InputOperation == '*') {
            System.out.printf("\nHasil %.1f %s %.1f = %.1f\n",Input1,InputOperation,Input2,(Input1*Input2));
        } else if (InputOperation == '/') {
            System.out.printf("\nHasil %.1f %s %.1f = %.1f\n",Input1,InputOperation,Input2,(Input1/Input2));
        } else {
            System.out.println("Keknya ada kesalahan");
        }


        // gitulah
        System.out.println("\nAkhir Program");

    }
}


// sama tapi beda sistem aja