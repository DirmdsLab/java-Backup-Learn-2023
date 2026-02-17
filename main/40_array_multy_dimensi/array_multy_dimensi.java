import java.util.Arrays;

public class array_multy_dimensi {
    public static void main(String[] args) {
        // berdimensi :)
        int[][] ArrayBerdimensi1 = {
            {1,2,3,4},
            {1,2,3,4}
        };
        System.out.println(Arrays.deepToString(ArrayBerdimensi1));

        // print pakai for
        int[][] ArrayBerdimensi2 = new int[4][5];
        ArrayBerdimensi2[0][0] = 1;
        ArrayBerdimensi2[2][4] = 1;

        

        for (int i = 0; i < ArrayBerdimensi2.length; i++){
            for (int j = 0; j < ArrayBerdimensi2[i].length; j++){
                System.out.print("[ ");
                System.out.print(ArrayBerdimensi2[i][j]);
                System.out.print(" ]");
            }
            System.out.println();
        }

        System.out.println();

        int[][] RandArray = {
            {1,2,3},
            {1,2,3,4},
            {1,2}
        };
        PrintArray(RandArray);

    }

    private static void PrintArray(int[][] Input){
        for (int i = 0; i < Input.length; i++){
            for (int j = 0; j < Input[i].length; j++){
                System.out.print("[ ");
                System.out.print(Input[i][j]);
                System.out.print(" ]");
            }
            System.out.println();
        }
    }
    
}


// gitulah ^_^