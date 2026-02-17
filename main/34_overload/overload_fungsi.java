public class overload_fungsi {
    public static void main(String[] args) {
        PrintAngka(1);
        PrintAngka(1,2);
        PrintAngka(1,2,3);

        // malas buat moment ^_^
        // pokoknya gitu sih
        // pahami aja 

    }   
    
    private static void PrintAngka (int Input){
        System.out.println("Ini angka : " + Input);
    }
    private static void PrintAngka (int Input1, int Input2){
        System.out.println("Ini angka : " + Input1 + " Dan " + Input2);
    }
    private static void PrintAngka (int Input1, int Input2, int Input3){
        System.out.println("Ini angka : " + Input1 + " Dan " + Input2 + " Dan " + Input3);
    }

}
