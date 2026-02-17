public class void_ {
    public static void main(String[] args) {
        // jangan peduliin while nya
        int npc = 0;
        while (true) {
            npc++;
            PrintNama("Turu " + npc);  
            if (npc == 5) {
                break;
            }
        }
    }   
    
    private static void PrintNama (String Input) {
        System.out.println("Hai " + Input);
    }

    // gitulah void

}
