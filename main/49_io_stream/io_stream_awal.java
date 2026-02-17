import java.io.FileInputStream;
import java.io.IOException;

public class io_stream_awal {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream DataAnime = new FileInputStream("Anime.txt");
            System.out.print((char)DataAnime.read());
            System.out.print((char)DataAnime.read());
            System.out.print((char)DataAnime.read());
            System.out.print((char)DataAnime.read());
        } catch (Exception e) {
            System.err.println("File Tidak Ditemukan");
        }

        System.out.println("\nAkhir Program");

    }
}
