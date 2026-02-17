import java.util.Scanner;

public class switch_ {
    public static void main(String[] args) {
        Scanner InputStr = new Scanner(System.in);

        String InputUser;
        System.out.print("Masukan kata 'Turu' : ");
        InputUser = InputStr.next();

        switch (InputUser) {
            case "Turu":
                System.out.println("Hai " + InputUser);
                break;
            case "TURU":
                System.out.println("Sambar bang " + InputUser);
                break;
            default:
                System.out.println("Gelud? ^_^");
                break;
        }

        System.out.println("Akhir :v");
        // gitu aja sih ^_^

    }
}