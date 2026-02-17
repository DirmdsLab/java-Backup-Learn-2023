public class bitwise {
    public static void main(String[] args) {
        System.out.println("Bitwise");

        int x = 5;
        int y = 9;
        int z;
        String Bit_x, Bit_y, Bit_z;

        // geser dikit ( << )
        System.out.println("==== Geser Dikit ( << ) ====");
        z = (x << 1);
        Bit_x = String.format("%8s", Integer.toBinaryString(x)).replace(' ', '0');
        Bit_z = String.format("%8s", Integer.toBinaryString(z)).replace(' ', '0');
        
        System.out.printf("%s = %d\n",Bit_x,x);
        System.out.printf("%s = %d\n",Bit_z,z);
        
        // geser dikit ( >> )
        System.out.println("\n==== Geser Dikit ( >> ) ====");
        z = (x >> 1);
        Bit_x = String.format("%8s", Integer.toBinaryString(x)).replace(' ', '0');
        Bit_z = String.format("%8s", Integer.toBinaryString(z)).replace(' ', '0');
        
        System.out.printf("%s = %d\n",Bit_x,x);
        System.out.printf("%s = %d\n",Bit_z,z);
        
        // or ( | )
        System.out.println("\n==== OR ( | ) ====");
        z = (x | y);
        Bit_x = String.format("%8s", Integer.toBinaryString(x)).replace(' ', '0');
        Bit_y = String.format("%8s", Integer.toBinaryString(y)).replace(' ', '0');
        Bit_z = String.format("%8s", Integer.toBinaryString(z)).replace(' ', '0');
        
        System.out.printf("%s = %d\n",Bit_x,x);
        System.out.printf("%s = %d\n",Bit_y,y);
        System.out.println("------------------ OR");
        System.out.printf("%s = %d\n",Bit_z,z);
        
        // and ( & )
        System.out.println("\n==== And ( & ) ====");
        z = (x & y);
        Bit_x = String.format("%8s", Integer.toBinaryString(x)).replace(' ', '0');
        Bit_y = String.format("%8s", Integer.toBinaryString(y)).replace(' ', '0');
        Bit_z = String.format("%8s", Integer.toBinaryString(z)).replace(' ', '0');
        
        System.out.printf("%s = %d\n",Bit_x,x);
        System.out.printf("%s = %d\n",Bit_y,y);
        System.out.println("------------------ And");
        System.out.printf("%s = %d\n",Bit_z,z);
        
        // XOR ( ^ )
        System.out.println("\n==== XOR ( ^ ) ====");
        z = (x ^ y);
        Bit_x = String.format("%8s", Integer.toBinaryString(x)).replace(' ', '0');
        Bit_y = String.format("%8s", Integer.toBinaryString(y)).replace(' ', '0');
        Bit_z = String.format("%8s", Integer.toBinaryString(z)).replace(' ', '0');
        
        System.out.printf("%s = %d\n",Bit_x,x);
        System.out.printf("%s = %d\n",Bit_y,y);
        System.out.println("------------------ XOR");
        System.out.printf("%s = %d\n",Bit_z,z);

        // not ( ~ )
        System.out.println("\n==== Not ( ~ )");
        z = ~ x;
        Bit_x = String.format("%8s",Integer.toBinaryString(x)).replace(' ', '0');
        Bit_z = String.format("%8s",Integer.toBinaryString(z)).substring(24);
        System.out.printf("%s = %d\n",Bit_x,x);
        System.out.printf("%s = %d\n",Bit_z,z); 
    }
}