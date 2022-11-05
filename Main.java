import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Pemilik_Sewa ps = new Pemilik_Sewa();
        Scanner Pemilik_sewa = new Scanner(System.in);
        System.out.println("=====PETUGAS=====");
        System.out.println("Masukkan Nama = ");
        ps.nama = Pemilik_sewa.nextLine();
        System.out.println("Masukkan NO HP = ");
        ps.no_telp = Pemilik_sewa.nextLine();

        Penyewa pyw = new Penyewa();
        Scanner penyewa = new Scanner(System.in);
        System.out.println("=====PENYEWA=====");
        System.out.println("Masukkan Nama = ");
        pyw.nama_penyewa = penyewa.nextLine();
        System.out.println("Masukkan NO KTP = ");
        pyw.noktp = penyewa.nextLine();
        System.out.println("Masukkan NO HP = ");
        pyw.notelp = penyewa.nextLine();
        System.out.println("Masukkan Alamat Anda = ");
        pyw.alamat = penyewa.nextLine();

        System.out.println("==========DATA PETUGAS===========");
        System.out.println("Nama Petugas = " +ps.getNama());
        System.out.println("No.Hp : " +ps.getNo_telp());
        System.out.println("==========DATA PENYEWA===========");
        System.out.println("Nama Penyewa = " +pyw.getNama_penyewa());
        System.out.println("No KTP = " +pyw.getNoktp());
        System.out.println("No HP = " +pyw.getNotelp());
        System.out.println("Alamat = " +pyw.getAlamat());

        Kamera kam = new Kamera("1,2");
        Scanner Kamera = new Scanner(System.in);


        Kamera cek1 = new Dslr("1");
        Dslr ds = new Dslr("1");
        Scanner Dslr = new Scanner(System.in);
        System.out.println("DAFTAR KAMERA DSLR = "+cek1.getKd_sewa());
        cek1.Kamera_Dslr();
        System.out.println("Pilihlah Kamera Sesuai Dengan Yang Anda Inginkan = ");


        Kamera cek2 = new Analog("2");
        Analog ag = new Analog("2");
        Scanner mobil_mpv = new Scanner(System.in);
        System.out.println("DAFTAR KAMERA ANALOG = "+cek2.getKd_sewa());
        cek2.Kamera_Analog();
        System.out.println("Pilihlah Kamera Sesuai Dengan Yang Anda Inginkan = ");
    }
}