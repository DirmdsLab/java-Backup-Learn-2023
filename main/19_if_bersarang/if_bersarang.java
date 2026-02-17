import java.util.Scanner;

public class if_bersarang {
    public static void main(String[] args) {
        Scanner InputUser = new Scanner(System.in);

        int input;
        System.out.print("Masukan angka 1 : ");
        input = InputUser.nextInt();

        // if
        if ( input == 1 ) {
            System.out.print("Masukan angka 2 : ");
            input = InputUser.nextInt();

            if (input == 2 ) {
                System.out.print("Masukan angka 3 : ");
                input = InputUser.nextInt();

                if (input == 3 ) {
                System.out.print("Masukan angka 4 : ");
                input = InputUser.nextInt();

                     if (input == 4 ) {
                    System.out.print("Masukan angka 5 : ");
                    input = InputUser.nextInt();
                        if (input == 5 ) {
                            System.out.println("Finish");
                            System.out.println("Dah itu aja ^_^");
                        } else {
                            System.out.println("Kawaisoo");
                        }
                    } else {
                        System.out.println("Padahal dikit lagi -_-");
                    }
                } else {
                    System.out.println("Hmph");
                }
            } else {
                System.out.println("Dah lah");
            }

        } else {
            System.out.println("Ahh ngak asik");
        }

        System.out.println("Hmph :p");
        // gitulah agak lain tapi gitulah :p

    }
}