public class latihan_matrix_part2 {
    public static void main(String[] args) {
        System.out.println("Perkalian matrix");

        int[][] matrix_1 = {
            {1,2},
            {3,4}
        };

        int[][] matrix_2 = {
            {11,12},
            {13,14}
        };

        PrintMatrix(matrix_1);
        System.out.println();
        PrintMatrix(matrix_2);
        System.out.println();

        int buffer;
        int[][] hasil = new int[matrix_1.length][matrix_1[0].length];

        // masih belum paham saya ^_^
        // nanti update lagi

        for (int i = 0; i < matrix_1.length; i++){
            for (int j = 0; j < matrix_2[0].length; j++){
                buffer = 0;
                for(int k = 0; k < matrix_1.length; k++){
                    buffer += matrix_1[i][k] * matrix_2[k][j];
                }
                hasil[i][j] = buffer;
            }
        }        

        
        PrintMatrix(hasil);


    }

     private static void PrintMatrix (int[][] Input){
        for(int i = 0; i < Input.length; i++) {
            for(int j = 0; j < Input[i].length; j++){
                System.out.print("[ " + Input[i][j] + " ]");
            }
            System.out.println();
        }
     }

}