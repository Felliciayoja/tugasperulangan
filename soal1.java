package tugasbuaul;
import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {
        
        int batasAwal;
        int batasAkhir;
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan batas awal :" );
        batasAwal = input.nextInt();
        System.out.println("Masukkan batas akhir :");
        batasAkhir = input.nextInt();

        while (batasAwal<=batasAkhir) {
            
            System.out.println(batasAwal+","); 
            batasAwal+=6;
            
        }
    }
    
}
