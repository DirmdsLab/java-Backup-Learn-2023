import java.util.Scanner;

public class exception_awal {
    public static void main(String[] args) {
        Scanner InputUser = new Scanner(System.in);
    
        int[] ArrayTumbal = {1,2,3,4,5};
        int Input;

        System.out.print("Pilih nomor urut tumbal : ");
        Input =  InputUser.nextInt();
        
        try {
            System.out.printf("Tumbal yang di pilih adalah %d Dan Hasilnya : %d",Input,ArrayTumbal[Input]);
        } catch (Exception e) {
            System.err.println("Lu Yang jadi tumbal");
        } finally {
            System.out.println(" NPC");
        }
        
        System.out.println("Canda :v");

    }

    // intinya gitulah
    
}
