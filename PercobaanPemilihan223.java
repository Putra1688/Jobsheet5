import java.util.Scanner;
    public class PercobaanPemilihan223{
        public static void main(String[] args){
            Scanner input23 = new Scanner(System.in);

            System.out.println("Masukkan nilai uas: ");
            float uas = input23.nextFloat();
            System.out.println("Masukkan nilai uts: ");
            float uts = input23.nextFloat();
            System.out.println("Masukkan nilai kuiz: ");
            float kuiz = input23.nextFloat();
            System.out.println("Masukkan nilai tugas: ");
            float tugas = input23.nextFloat();

            float total = (uas*0.4f) + (uts*0.3f) + (kuiz*0.1f) + (tugas*0.1f);
            String message = total < 65 ? "Remidi" : "Tidak Remidi";
            System.out.println("Nilai akhir = " +total + "sehingga" +message);
            }
    }
