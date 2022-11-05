public class Dslr extends Kamera{
    int harga;
    int lama_sewa;
    public Dslr(String kd_sewa) {
        super(kd_sewa);
    }

    @Override
    public void Kamera_Dslr() {
        System.out.println(" 1. Nikon D5200, 30000/hari");
        System.out.println(" 2. Canon EOS 6D, 40000/hari");
        System.out.println(" 3. Sonu DSC H300, 50000/hari");
    }

    @Override
    public int total(int harga, int lama_sewa) {
        return harga * lama_sewa;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getLama_sewa() {
        return lama_sewa;
    }

    public void setLama_sewa(int lama_sewa) {
        this.lama_sewa = lama_sewa;
    }
}
