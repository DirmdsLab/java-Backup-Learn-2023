public class unary{
    public static void main(String[] args){
        int unaryInt = 1;
        System.out.println("Nilai awal unary : " + unaryInt + " Unery ' - ' : " + -unaryInt + "\n");

        // decrement dan increment
        int x = 1;
        System.out.println("Nilai awal x : " + x);
        x++;
        System.out.println("Nilai x++    : " + x);
        x--;
        System.out.println("Nilai x--    : " + x + "\n");

        // next
        int y = 5;
        System.out.printf("Nilai awal y : %d\n",y);
        System.out.println("Nilai ++y    : " + ++y);
        System.out.println("Nilai y++    : " + y++);
        System.out.println("Print y      : " + y + "\n");

        // bool
        boolean Truekah = true;
        System.out.println("Truekah?     : " + Truekah);
        System.out.println("Truekah? (!) : " + !Truekah);
    }
}