public class Analog extends Kamera{
    int harga;
    int lama_sewa;
    public Analog(String kd_sewa) {
        super(kd_sewa);
    }
    @Override
    public void Kamera_Analog() {
        System.out.println(" 1. Pentax K1000, 50000/hari");
        System.out.println(" 2. Ricoh KR-5, 60000/hari");
        System.out.println(" 3. Olympus OM-1, 70000/hari");
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
