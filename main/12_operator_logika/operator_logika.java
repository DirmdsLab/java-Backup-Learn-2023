public class operator_logika{
    public static void main(String[] args) {
        
        boolean x,y;

        // or 
        System.out.println("Operator logika or ( || )");
        System.out.printf("x (%s) || y (%s) : %s\n",x = false,y = false,(x || y));
        System.out.printf("x (%s)  || y (%s) : %s\n",x = true,y = false,(x || y));
        System.out.printf("x (%s) || y (%s)  : %s\n",x = false,y = true,(x || y));
        System.out.printf("x (%s)  || y (%s)  : %s\n",x = true,y = true,(x || y));

        // and
        System.out.println("\nOperator logika and ( && )");
        System.out.printf("x (%s) && y (%s) : %s\n",x = false,y = false,(x && y));
        System.out.printf("x (%s)  && y (%s) : %s\n",x = true,y = false,(x && y));
        System.out.printf("x (%s) && y (%s)  : %s\n",x = false,y = true,(x && y));
        System.out.printf("x (%s)  && y (%s)  : %s\n",x = true,y = true,(x && y));
        
        // ^
        System.out.println("\nOperator logika xor ( ^ )");
        System.out.printf("x (%s) ^ y (%s) : %s\n",x = false,y = false,(x ^ y));
        System.out.printf("x (%s)  ^ y (%s) : %s\n",x = true,y = false,(x ^ y));
        System.out.printf("x (%s) ^ y (%s)  : %s\n",x = false,y = true,(x ^ y));
        System.out.printf("x (%s)  ^ y (%s)  : %s\n",x = true,y = true,(x ^ y));
        
        // not
        System.out.println("\nOperator logika Not (!)");
        System.out.printf("x = (%s)  not (!) : %s\n",x = true,!x);
        System.out.printf("x = (%s) not (!) : %s\n",x = false,!x);
        System.out.println("Dah Itu aja ^_^");
    }
}