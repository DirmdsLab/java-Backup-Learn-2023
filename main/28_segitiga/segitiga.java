import java.util.Scanner;

public class segitiga {
    public static void main(String[] args) {
        System.out.println("Segitiga");

        int Input;
        char Model;
        Scanner InputUser = new Scanner(System.in);

        System.out.print("Masukan tingkat segitiga : ");
        Input = InputUser.nextInt();

        System.out.print("Masukan Model (ex * , 0 , A , etc) : ");
        Model = InputUser.next().charAt(0);

        // pola 1
        System.out.println("\nPola 1");

        for (int i = 1; i <= Input; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(Model);
            }
            System.out.println();
        }

        // pola 2
        System.out.println("\nPola 2");

        for (int i = 1; i <= Input; i++){
            for (int j = Input; j >= i; j--){
                System.out.print(Model);
            }
            System.out.println();
        }

        // pola 3
        System.out.println("\nPola 3");

        for (int i = 1; i <= Input; i++){
            for (int j = Input; j > i; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(Model);
            }
            System.out.println();
        }
        
        // pola 4
        System.out.println("\nPola 4");

        for (int i = 1; i <= Input; i++){
            for (int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for (int j = Input; j >= i; j--){
                System.out.print(Model);
            }
            System.out.println();
        }

        // pola 5
        System.out.println("\nPola 5");

        for (int i = 1; i <= Input; i++){
            for (int j = Input; j > i; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= (i*2-1); j++){
                System.out.print(Model);
            }
            System.out.println();
        }

        // pola 6
        System.out.println("\nPola 4");

        for (int i = 1; i <= Input; i++){
            for (int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for (int j = (Input*2-i); j >= i; j--){
                System.out.print(Model);
            }
            System.out.println();
        }

        // pola 7
        System.out.println("\nPola 7");

        for (int i = 1; i < Input; i++){
            for (int j = Input; j > i; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= (i*2-1); j++){
                System.out.print(Model);
            }
            System.out.println();
        }
        for (int i = 1; i <= Input; i++){
            for (int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for (int j = (Input*2-i); j >= i; j--){
                System.out.print(Model);
            }
            System.out.println();
        }

        // gitu aja
        System.out.println("\nFinish\n");

    }
}
