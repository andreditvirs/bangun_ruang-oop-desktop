public class BangunRuang{
    private float panjang, lebar, tinggi, volume;
    private String bentuk;

    public BangunRuang(float panjang, float lebar, float tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
	calculateVolume();
    }

    public void calculateVolume(){
        this.volume = 0;
    }
    
    public float getPanjang() {
        return panjang;
    }


    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public String getBentuk() {
        return bentuk;
    }

    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    public String toString(){
	return this.getBentuk();
    }
}