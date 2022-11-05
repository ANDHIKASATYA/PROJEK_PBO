public class Kamera {
    String kd_sewa;

    public int total(int harga, int lama_sewa) {
        System.out.println("-");
        return 0;
    }
    public void Kamera_Dslr(){
        System.out.println("Anda akan menyewa Kamera Dslr = ");
    }
    public void Kamera_Analog(){
        System.out.println("Anda akan menyewa Kamera Analog = ");
    }

    public Kamera(String kd_sewa) {
        this.kd_sewa = kd_sewa;
    }

    public String getKd_sewa() {
        return kd_sewa;
    }

    public void setKd_sewa(String kd_sewa) {
        this.kd_sewa = kd_sewa;
    }
}