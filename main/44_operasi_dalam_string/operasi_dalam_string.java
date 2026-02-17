public class operasi_dalam_string {
    public static void main(String[] args) {
        System.out.println("Operasi String");

        // cara buat 
        String Kata1 = "Mending Turu";
        System.out.println(Kata1);

        // mengambil kompunen dalam string
        System.out.println(Kata1.substring(8, 12));

        // gabung string
        String Kata2 = " Hmph";
        String Kata1_2 = Kata1 + Kata2 + " :v";
        System.out.println(Kata1_2);

        // besar dan kecil
        System.out.println(Kata1.toUpperCase());
        System.out.println(Kata1.toLowerCase());

        // replace
        System.out.println(Kata1);
        Kata1 = Kata1_2;
        System.out.println(Kata1);

        // compare 
        String DiBandinkan1;
        String DiBandinkan2;

        DiBandinkan1 = "AhhhC";
        DiBandinkan2 = "AhhhE";

        System.out.println(DiBandinkan1.compareTo(DiBandinkan2));
        System.out.println(DiBandinkan2.compareTo(DiBandinkan1));

        // persamaan
        String Persamaan1 = "Turu", Persamaan2 = "Turu";
        String Persamaan3 = new String("Turu");
        String Persamaan4 = new String("Turu");
        System.out.println(Persamaan3);

        if (Persamaan1 == Persamaan2){
            System.out.println("Sama");
        } else {
            System.out.println("tidak sama");
        }

        if (Persamaan3.equals(Persamaan4)){
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }

        if (Persamaan3.equals(Persamaan1)){
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }

        // agak berantakan tapi ngak ngaruh :v
        
    }
}