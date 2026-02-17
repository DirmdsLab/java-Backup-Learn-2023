public class komparasi {
    public static void main(String[] args){
        System.out.println("Komparasi");
        // nilai awal
        int x = 10;
        int y = 15;
        int z = 10;

        // Tokoh Utama
        // ==
        // !=
        // <
        // >
        // <=
        // >=
    

        System.out.println("Nilai Awal x : " + x);
        System.out.println("Nilai Awal y : " + y);
        System.out.println("Nilai Awal z : " + z);

        // sama dengan
        System.out.println("\n===== Persamaan =====");
        System.out.printf("x (%d) sama dengan y (%d) : %s\n",x,y,(x == y));
        System.out.printf("x (%d) sama dengan z (%d) : %s\n",x,z,(x == z));
        
        // tidak sama dengan
        System.out.println("\n===== Tidak Sama Dengan =====");
        System.out.printf("x (%d) Tidak Sama Dengan y (%d) : %s\n",x,y,(x != y));
        System.out.printf("x (%d) Tidak Sama Dengan z (%d) : %s\n",x,z,(x != z));
        
        // lebih kecil dari
        System.out.println("\n===== Lebih Kecil Dari =====");
        System.out.printf("x (%d) Lebih Kecil Dari y (%d) : %s\n",x,y,(x < y));
        System.out.printf("x (%d) Lebih Kecil Dari z (%d) : %s\n",x,z,(x < z));
        
        // Lebih Besar Dari
        System.out.println("\n===== Lebih Besar Dari =====");
        System.out.printf("x (%d) Lebih Besar Dari y (%d) : %s\n",x,y,(x > y));
        System.out.printf("x (%d) Lebih Besar Dari z (%d) : %s\n",x,z,(x > z));
        
        // Lebih Kecil Sama Dengan
        System.out.println("\n===== Lebih Kecil Sama Dengan =====");
        System.out.printf("x (%d) Lebih Kecil Sama Dengan y (%d) : %s\n",x,y,(x <= y));
        System.out.printf("x (%d) Lebih Kecil Sama Dengan z (%d) : %s\n",x,z,(x <= z));
        
        // Lebih Besar Sama Dengan
        System.out.println("\n===== Lebih Besar Sama Dengan =====");
        System.out.printf("x (%d) Lebih Besar Sama Dengan y (%d) : %s\n",x,y,(x >= y));
        System.out.printf("x (%d) Lebih Besar Sama Dengan z (%d) : %s\n",x,z,(x >= z));

        // dah itu aja ^_^

    }
}