package bangunruang;
public abstract class BangunRuang {
    private long panjang;
    private long lebar;
    private long tinggi;
    private long volume;
    private String bentuk;

    public BangunRuang() {
    }

    public BangunRuang(long panjang, long lebar, long tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public long getPanjang() {
        return panjang;
    }

    public void setPanjang(long panjang) {
        this.panjang = panjang;
    }

    public long getLebar() {
        return lebar;
    }

    public void setLebar(long lebar) {
        this.lebar = lebar;
    }

    public long getTinggi() {
        return tinggi;
    }

    public void setTinggi(long tinggi) {
        this.tinggi = tinggi;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public String getBentuk() {
        return bentuk;
    }

    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }
    
    public abstract long hitungVolume();
}
