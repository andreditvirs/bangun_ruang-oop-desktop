package bangunruang;
public class Balok extends BangunRuang{

    public Balok() {
    }

    public Balok(long panjang, long lebar, long tinggi) {
        super(panjang, lebar, tinggi);
        super.setVolume(hitungVolume());
        super.setBentuk("Balok");
    }

    @Override
    public long hitungVolume() {
        return getPanjang() * getLebar() * getTinggi();
    }
}