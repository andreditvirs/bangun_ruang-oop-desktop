package bangunruang;
public class Bola extends BangunRuang{

    public Bola() {
    }

    public Bola(long diameter) {
        super(diameter, diameter, diameter);
        super.setVolume(hitungVolume());
        super.setBentuk("Bola");
    }
    
    @Override
    public long hitungVolume() {
        long r = getPanjang() / 2;
        return (long) (4 * Math.PI * r * r * r / 3);
    }
    
}
