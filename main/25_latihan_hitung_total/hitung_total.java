import java.util.Scanner;

import javax.swing.ToolTipManager;

public class hitung_total {
    public static void main(String[] args) {
        System.out.println("Hitung Total\n");

        // persiapan
        int Input1, Input2, Total, output;
        Scanner InputUser;
        
        InputUser = new Scanner(System.in);

        System.out.print("Hitung Mulai Dari : ");
        Input1 = InputUser.nextInt();

        System.out.print("Hitung Sampai     : ");
        Input2 = InputUser.nextInt();
        
        Total = (Input1 - 1);
        output = 0;

        // bagian 1
        if (Input1 <= Input2) {
            System.out.print("\nHasilnya : ");
            while (Input1 <= Input2) {
                Total++;
                System.out.print(Total);
                
                output = output + Total;

                // output = output
                if (Total == Input2) {
                    break;
                }
                System.out.print(" + ");
            }
            System.out.println(" = " + output);
        } else if (Input1 >= Input2) {
            int Input1_2Kebalik, Input2_1Kebalik, fake_Total;
            Input1_2Kebalik = Input2;
            Input2_1Kebalik = Input1;
            fake_Total = Input1;
            Total = (Input1_2Kebalik - 1);

            System.out.print("\nHasilnya : ");
            while (Input1_2Kebalik <= Input2_1Kebalik) {
                Total++;
                System.out.print(fake_Total);
                fake_Total--;
                
                output = output + Total;

                // output = output
                if (Total == Input2_1Kebalik) {
                    break;
                }
                System.out.print(" + ");
            }
            System.out.println(" = " + output);

        }

        // gitulah pahami aja ^_^


    }
}