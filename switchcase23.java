import java.util.Scanner;
public class Lat223 {
    public static void main(String[] args){
        Scanner input23 = new Scanner(System.in);
        int angka;

        System.out.println("Masukkan angka: ");
        angka = input23.nextInt();

        switch (angka) {
            case 1:
            System.out.println("Hari Senin");
            break;
            case 2:
            System.out.println("Hari Selasa");
            break;
            case 3:
            System.out.println("Hari Rabu");
            break;
            case 4:
            System.out.println("Hari Kamis");
            break;
            case 5:
            System.out.println("Hari Jumat");
            break;
            case 6:
            System.out.println("Hari Sabtu");
            break;
            case 7:
            System.out.println("Hari Minggu");
            break;

            defaullt:
            System.out.println("Maaf, angka yang Anda masukkan salah");

        }
    }
}