import java.util.Scanner;

public class if_else_if {
    public static void main(String[] args) {
        
        Scanner InputUser = new Scanner(System.in);

        int input;
        System.out.print("Masukan angka 1 - 5 : ");
        input = InputUser.nextInt();

        // if
        if ( input == 5 ){
            System.out.println("Saya Adalah 5");
        } else if ( input == 4 ) {
            System.out.println("Saya adalah 4");
        } else if ( input == 3 ) {
            System.out.println("Saya adalah 3");
        } else if ( input == 2 ) {
            System.out.println("Saya adalah 2");
        } else if ( input == 1 ) {
            System.out.println("Saya adalah 1");
        } else {
            System.out.println("Ngajak ngelud? :v");
        }

        System.out.println("Finish");
        // gitu lah kira kira

    }
}