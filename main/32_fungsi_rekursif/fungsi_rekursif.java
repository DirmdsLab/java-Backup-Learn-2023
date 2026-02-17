import java.io.PrintStream;
import java.util.Scanner;

public class fungsi_rekursif {
    public static void main(String[] args) {
        PrintStream  PrintToConsole = System.out;
        Scanner InputUser = new Scanner(System.in);

        int Input, output;

        PrintToConsole.println("Fungsi rekursif");
        
        PrintToConsole.println("\nHitung Total");
        PrintToConsole.print("Masukan angka : ");
        Input = InputUser.nextInt();


        // hitung total
        PrintToConsole.print("Total     : ");
        output = HitungJumlah(Input);
        PrintToConsole.println(output);
        
        // faktorial
        PrintToConsole.print("Faktorial : ");
        output = Faktorial(Input);
        PrintToConsole.println(output);



    }

    // system code nya

    private static int Faktorial (int Input) {
        if (Input == 1) {
            System.out.print(Input + " = ");
            return Input;
        }
        System.out.print(Input + " x ");
        return Input * Faktorial(Input-1);
    }
    
    private static int HitungJumlah (int Input) {
        if (Input == 1) {
            System.out.print(Input + " = ");
            return Input;
        }
        System.out.print(Input + " + ");
        return Input + HitungJumlah(Input-1);
    }

}
