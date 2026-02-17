public class break_continue_return {
    public static void main(String[] args) {
        System.out.println("break, continue and return");
        int npc = 0;

        while (npc <= 10) {
            npc++;
            
            // break and continue
            if (npc == 8) {
                break;  
            } else if (npc == 5) {
                continue;
            }
            System.out.println("Npc ke : " + npc);
        }

        // return
        if (npc <= 10) {
            return;
        }

        // fungsinya sangat banyak tapi nanti aja pelajari nya dasar dulu

        System.out.println("Saya tidak di anggap T_T");

    }    
}
