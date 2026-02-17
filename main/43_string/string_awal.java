public class string_awal {
    public static void main(String[] args) {
        System.out.println("String\n");

        // string
        String Name = "LordTuru";
        System.out.println(Name);

        // char
        char[] NameChar = {'L','o','r','d','T','u','r','u',' ','C','h','a','r'};

        for (int i = 0; i < NameChar.length; i++){
            System.out.print(NameChar[i]);
        }

        System.out.println();

        // mengakses komponen dari string
        System.out.println(Name.charAt(1));
        System.out.println(NameChar[3]);

        // merubah karakter dalam string secara tidak langsung 
        Name = 'o' + Name.substring(1,8);
        System.out.println(Name);

        // memory string di java ada string pool
        // untuk lebih lanjut emang harus di pelajari langsung

    }
}