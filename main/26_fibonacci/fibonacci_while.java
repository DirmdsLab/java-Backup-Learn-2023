import java.util.Scanner;

public class fibonacci_while {
    public static void main(String[] args) {
        System.out.println("Program fibonacci while");
        Scanner InputUser = new Scanner(System.in);
        int Input, fibo_1, fibo_2, Total, output;

        System.out.print("Masukan fibo ke : ");
        Input = InputUser.nextInt();

        fibo_1 = 0;
        fibo_2 = 1;
        Total  = 1;

        System.out.print("\nHasil : | " + fibo_2);
        while (Total < Input) {
            output = fibo_1 + fibo_2;
            fibo_1 = fibo_2;
            fibo_2 = output;
            System.out.print(" | " + output);
            Total++;
        }
        System.out.println(" | ");

    }
}