package tugasbuaul;
import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        int jumlahSiswa;
        int nilaiSiswa;
        int Absen;
        double totalNilai=0;
        double rataRata;
        Scanner input = new Scanner (System.in);

        System.out.println("Jumlah siswa");
        jumlahSiswa = input.nextInt();
        for(Absen=1; Absen<=jumlahSiswa; Absen++) {
            System.out.println("Masukkan nilai siswa ke -"+ Absen+":");
            nilaiSiswa = input.nextInt();
            totalNilai += nilaiSiswa;
        }
        rataRata = totalNilai/jumlahSiswa;
        System.out.println("rata rata nilai dari "+ jumlahSiswa+" siswa adalah ="+rataRata);

    }
    
}
