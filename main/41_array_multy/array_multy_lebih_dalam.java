import java.util.Arrays;

public class array_multy_lebih_dalam {
    public static void main(String[] args) {
        System.out.println("Array");
        char[] Char1 = {'a','b','c'};
        char[] Char2 = {'a','b','c'};
        char[][] Gabung = {
            Char1,
            Char2
        };

        PrintArray(Gabung);

    }

    private static void PrintArray(char[][] Input){
        for (int i = 0; i < Input.length; i++){
            for(int j = 0; j < Input[i].length; j++){
                System.out.print("[");
                System.out.print(Input[i][j]);
                System.out.print("]");
            }
            System.out.println();
        }
    }

}
