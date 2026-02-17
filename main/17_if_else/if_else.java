import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        
        Scanner InputUser = new Scanner(System.in);
        System.out.print("Masukan Angka 5 : ");
        int x = InputUser.nextInt();
        if (x == 5) {
            System.out.println("Saya adalah 5");
        } else {
            System.out.println("Saya bukan lima");
        }
    }
}
