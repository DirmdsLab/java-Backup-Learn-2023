import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class write_read_external {
    public static void main(String[] args) throws IOException {
        
        // part 1

        // Deklarasi
        FileInputStream NoteAnime = null;

        // buka FIle
        NoteAnime = new FileInputStream("NoteAnime.txt");

        // membaca File
        int size = NoteAnime.available();

        for (int i = 0; i < size; i++){
            System.out.print((char)NoteAnime.read());
        }
        System.out.println("\n"); // nambah enter ^_^

        // menutup File
        NoteAnime.close();

        // part 2

        FileInputStream InputFile = null;
        FileOutputStream OutputFile = null;

        try {
            InputFile = new FileInputStream("Input.txt");
            OutputFile = new FileOutputStream("Output.txt");

            size = InputFile.available();
            int buffer;

            for (int i = 0; i < size; i++){
                buffer = InputFile.read();
                System.out.print((char)buffer);
                OutputFile.write(buffer);
            }

        } catch (Exception e) {
            System.err.println("File Tidak Di Temukan");
        } finally {
            InputFile.close();
            OutputFile.close();
        }

        System.out.println("\n");

        // part 3
        try (
            FileInputStream InputFile3 = new FileInputStream("In.txt");
            FileOutputStream OutputFile3 = new FileOutputStream("Out.txt")
        ) {
            
            size = InputFile3.available();
            int Buffer3, Total = 0;

            while (Total < size) {
                Buffer3 = InputFile3.read();
                System.out.print((char)Buffer3);
                OutputFile3.write(Buffer3);
                Total++;
            }

        } catch (Exception e) {
            System.err.println("Lah Kok Hilang :v");
        }

        // dah itu aja ^_^

    }
}