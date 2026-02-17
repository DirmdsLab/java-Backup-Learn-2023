public class apa_fungsinya_si_fungsi {
    public static void main(String[] args) {
        System.out.println("Fungsi apa fungsinya dari sifungsi ini :v");

        // misal untuk buat kuadrat
        // int x, output;
        // x = 5;
        // output = x * x;
        // System.out.println("Hasil : " + output);

        // gitu ribetkan kalau buat 100 kali 
        // bayangkan aja :v

        int x, output;
        x = 5;
        output = Kuadrat(x);
        System.out.println("Hasil 1 : " + output);

        float y, output_2;
        y = 1.0f;
        output_2 = SatuTambahSatu(y);
        System.out.println("Hasil 2 : " + output_2);

    }

    private static int Kuadrat (int Input) {
        return Input * Input;
    }

    public static float SatuTambahSatu (float Dua) {
        float output;
        output = Dua + Dua;
        return output;
    }

    // gitu lah caranya 
    // ketika masuk ke kasus bakal lebih paham 
    // ^_^

}