public class looping_array {
    public static void main(String[] args) {
        System.out.println("loop array");

        int[] IntArray = {1,2,3,4,5};

        // normal loop
        System.out.println("\nNormal Array");
        for (int i = 0; i < 5; i++){ // udah fix
            System.out.println("Array Normal ke : " + IntArray[i]);
        }

        // normal loop pakai length
        System.out.println("\nNormal Array pakai length");
        System.out.println("Panjang array : " + IntArray.length);

        for (int i = 0; i < IntArray.length; i++) {
            System.out.println("Array Normal ke : " + IntArray[i]);
        }

        // pakai looping array
        System.out.println("\nPakai Looping array");
        for (int Outout : IntArray){
            System.out.println("Array ke : " + Outout);
        }


    }
}
