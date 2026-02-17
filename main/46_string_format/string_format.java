public class string_format {
    public static void main(String[] args) {
        // print normal
        String Name = "LordTuru";
        int Umur = 999;

        System.out.println("Print Biasa : " + Name + " Umur : " + Umur);

        // print format 
        System.out.printf("Print format : %s Umur : %d\n",Name,Umur);
        
        System.out.printf("Saya adalah %1$s dan dipanggil %1$s Ahaha umur %2$d",Name,Umur);

        // dan gitulah
        // print f domentasinya lihat di web java ^_^ (sebenarnya cuma malas aja buat nya :))
    }
}
