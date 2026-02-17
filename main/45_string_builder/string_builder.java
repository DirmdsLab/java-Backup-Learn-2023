import java.lang.StringBuilder;

public class string_builder {
    public static void main(String[] args) {
        System.out.println("String Builder");

        // tokoh utama
        StringBuilder SayaSiBuilder = new StringBuilder("LordTuru");
        Print(SayaSiBuilder);
        
        // append
        SayaSiBuilder.append(" Hmph");
        Print(SayaSiBuilder);
        
        // insert
        SayaSiBuilder.insert(4," ");
        Print(SayaSiBuilder);
        
        // delete
        SayaSiBuilder.delete(0, 5);
        Print(SayaSiBuilder);
        
        // rubah char 
        SayaSiBuilder.setCharAt(7, 'm');
        SayaSiBuilder.setCharAt(8, 'm');
        Print(SayaSiBuilder);
        
        // replace
        SayaSiBuilder.replace(5, 9, "Hmph");
        Print(SayaSiBuilder);

        // casting to string
        String SayaOriginalString = SayaSiBuilder.toString();
        Print(SayaOriginalString);
        
        // rubah di string biasa
        SayaOriginalString = SayaOriginalString + " :v";
        Print(SayaOriginalString);

        // balikan
        SayaSiBuilder = new StringBuilder(SayaOriginalString);
        Print(SayaSiBuilder);

        // gitulah
        // rapi sebuah code tergantung mood :v

    }

    // supaya cepat ^_^

    private static void Print(StringBuilder Input){
        int alamat;

        System.out.println("Isi      : " + Input);
        System.out.println("Panjang  : " + Input.length());
        System.out.println("Capacity : " + Input.capacity());

        alamat = System.identityHashCode(Input);
        System.out.println("Alamat   : " + Integer.toHexString(alamat) + "\n");
    }
    private static void Print(String Input){
        int alamat;

        System.out.println("Isi      : " + Input);
        System.out.println("Panjang  : " + Input.length());

        alamat = System.identityHashCode(Input);
        System.out.println("Alamat   : " + Integer.toHexString(alamat) + "\n");
    }

}