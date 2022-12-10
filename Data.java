import java.util.Scanner;
public class Data extends Awal {
    public int pilih;
    Scanner input = new Scanner(System.in);
    @Override
    public void Masuk() {
        System.out.println("Masukkan Pilihan Anda");
        pilih=input.nextInt();
    }
    @Override
    public void hargaDslr() {
        if (pilih==1){
            System.out.println(" 1. Pentax K1000, 50000/hari");
        }
        else if (pilih==2) {
            System.out.println(" 2. Ricoh KR-5, 60000/hari");
        }
        else if (pilih==3) {
            System.out.println(" 3. Olympus OM-1, 70000/hari");
        }
        else {
            System.out.println("Pilihan tidak tersedia ");
        }
    }
    @Override
    public void hargaAnalog() {
        if (pilih==1){
            System.out.println(" 1. Nikon D5200, 30000/hari");
        }
        else if (pilih==2) {
            System.out.println(" 2. Canon EOS 6D, 40000/hari");
        }
        else if (pilih==3) {
            System.out.println(" 3. Sonu DSC H300, 50000/hari");
        }
        else {
            System.out.println("Pilihan tidak tersedia ");
        }
    }
    @Override
    public void outputDslr() {
    }
    @Override
    public void outputAnalog() {
    }
}
