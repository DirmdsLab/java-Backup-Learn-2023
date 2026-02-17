import java.util.Scanner;

public class fibonacci_for {
    public static void main(String[] args) {
        System.out.println("Program fibonacci for");
        Scanner InputUser = new Scanner(System.in);
        int Input, fibo_1, fibo_2, output;

        System.out.print("Masukan fibo ke : ");
        Input = InputUser.nextInt();

        fibo_1 = 0;
        fibo_2 = 1;

        System.out.print("\nHasil : | " + fibo_2);
        for (int i = 1; i < Input; i++){
            output = fibo_1 + fibo_2;
            fibo_1 = fibo_2;
            fibo_2 = output;
            System.out.print(" | " + output);
        }
        System.out.println(" | ");
    }
}