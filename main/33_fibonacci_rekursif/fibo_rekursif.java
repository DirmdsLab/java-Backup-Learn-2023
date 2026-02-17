import java.util.Scanner;

public class fibo_rekursif {
    public static void main(String[] args) {
        Scanner InputUser = new Scanner(System.in);

        int Input;

        System.out.println("Fibonacci rekursif");
        System.out.print("Masukan angka fibo ke : ");
        Input = InputUser.nextInt();

        System.out.println("Hasil : " + FiboRekursif(Input));
    }

    private static int FiboRekursif (int Input) {
        if (Input == 1 || Input == 0) {
            return Input;
        }
        return FiboRekursif(Input-1) + FiboRekursif(Input-2);
    }

    // malah hafal (konteks cpp)

}
